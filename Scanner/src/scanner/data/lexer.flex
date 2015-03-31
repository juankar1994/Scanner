package scanner.data;
import static scanner.data.Token.*;
%%
%class Lexer
%type Token
%line
%column
%public
%{
    private Lexema lexema(Token type) {
        return new Lexema(type, yyline, yycolumn);
    }
    private Lexema lexema(Token type, Object value) {
        return new Lexema(type, value, yyline, yycolumn);
    }
    public String token;
    public Lexema lexeme;
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
{ lexeme= lexema(OPERADOR,yytext()); return OPERADOR;}
"auto" | "break" | "case" | "char" | "const" | "continue" | "default" | "do" | "double" | 
"else" | "enum" | "extern" | "float" | "for" | "goto" | "if" | "int" | "long" | "register" |
"return" | "short" | "signed" | "sizeof" | "static" | "struct" | "switch" | "typedef" | "union" |
"unsigned" | "void" | "volatile" | "while" { lexeme= lexema(PALABRA_RESERVADA,yytext()); return PALABRA_RESERVADA;}
"-"{0,1}{DIGITO}+"."{0,1}{DIGITO}* | "\""(\\.|[^"\""])*"\"" | ("'"{LETRA}"'") { lexeme= lexema(LITERAL,yytext()); return LITERAL;}
{LETRA}({LETRA}|{DIGITO})* {lexeme = lexema(IDENTIFICADOR,yytext()); return IDENTIFICADOR;}
. {lexeme = lexema(ERROR); return ERROR;}