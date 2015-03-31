package scanner.data;
import static scanner.data.Token.*;
%%
%class Lexer
%type Token
%line
%column
%public
%{
public String lexeme;
public int linea;
%}

LETRA = [a-zA-Z_]
DIGITO = [0-9]
NUMERO = [1-9]
ESPACIO=[ \t\r\n]
%%
{ESPACIO} {/*Ignore*/}
"," | ";" | "?" | "||" | "&&" | "(" | ")" | "[" | "]" | "{" | "}" | ":" | "." |
"++" | "--" | "~" | "#" |
( "*" | "+" | "-" | "/" | "!" | "=" | "<" | ">" | "%" | "&" |"^" | "|" | "<<" | ">>" | "-" ){0,1}={0,1} 
{linea= yyline; lexeme=yytext(); return OPERADOR;}
"auto" | "break" | "case" | "char" | "const" | "continue" | "default" | "do" | "double" | 
"else" | "enum" | "extern" | "float" | "for" | "goto" | "if" | "int" | "long" | "register" |
"return" | "short" | "signed" | "sizeof" | "static" | "struct" | "switch" | "typedef" | "union" |
"unsigned" | "void" | "volatile" | "while" { linea= yyline;lexeme=yytext(); return PALABRA_RESERVADA;}
"-"{0,1}{DIGITO}+"."{0,1}{DIGITO}* | "\""(\\.|[^"\""])*"\"" | ("'"{LETRA}"'") { linea= yyline;lexeme=yytext(); return LITERAL;}
{LETRA}({LETRA}|{DIGITO})* {linea= yyline; lexeme=yytext(); return IDENTIFICADOR;}
 
. {return ERROR;}