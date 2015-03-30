package scanner.data;
import static scanner.data.Token.*;
%%
%class Lexer
%type Token
%public
LETRA = [a-zA-Z_]
DIGITO = [0-9]
ESPACIO=[ \t\r\n]
%{
public String lexeme;
%}
%%
{ESPACIO} {/*Ignore*/}
"," | ";" | "?" | "||" | "&&" | "(" | ")" | "[" | "]" | "{" | "}" | ":" | "." | "\"" |
"++" | "--" | "~" | 
( "*" | "+" | "-" | "/" | "!" | "=" | "<" | ">" | "%" | "&" |"^" | "|" | "<<" | ">>" | "-" ){0,1}={0,1} 
{lexeme=yytext(); return OPERADOR;}
"auto" | "break" | "case" | "char" | "const" | "continue" | "default" | "do" | "double" | 
"else" | "enum" | "extern" | "float" | "for" | "goto" | "if" | "int" | "long" | "register" |
"return" | "short" | "signed" | "sizeof" | "static" | "struct" | "switch" | "typedef" | "union" |
"unsigned" | "void" | "volatile" | "while" { lexeme=yytext(); return PALABRA_RESERVADA;}
{LETRA}({LETRA}|{DIGITO})* {lexeme=yytext(); return IDENTIFICADOR;}
"-"{0,1}{DIGITO}+"."{0,1}{DIGITO}+ {lexeme=yytext(); return LITERAL;}
 
. {return ERROR;}