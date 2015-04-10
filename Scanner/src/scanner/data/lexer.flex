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
    public String string;
    public Lexema lexeme;
%}
LETRA = [a-zA-Z_]
NUMERO = [0-9]
DIGITO = [1-9]
OCTAL = [0-8]
HEXADECIMAL = [0-9a-fA-F]
FINDELINEA = \r|\n|\r\n
ESPACIO =[ \t\r\n] | {FINDELINEA} | [ \t\f]
CARACTER = [^\"\r\n]
CARACTER_C = "'"({CARACTER}|\")"'"

NUMERO_ENTERO = 0 | {DIGITO}{NUMERO}*(u|U)?(l|L)?
NUMERO_FlOTANTE = (0|({DIGITO}{NUMERO}*))?"."{NUMERO}+(u|U)?(l|L)? | {DIGITO}{NUMERO}*(e|E)"-"?{DIGITO}{NUMERO}*(u|U)?(l|L)?
NUMERO_OCTAL = 0({OCTAL})+(u|U)?(l|L)?
NUMERO_HEXADECIMAL = 0x({HEXADECIMAL})+(u|U)?(l|L)?
ID = {LETRA}({LETRA}|{DIGITO})*  
DIRECTIVAS = "#"(define|if|elif|message|undef|ifdef|include|else|endif|error)
PALABRAS_RESERVADAS = "auto" | "break" | "case" | "char" | "const" | "continue" | "default" | "do" | "double" | 
                      "else" | "enum" | "extern" | "float" | "for" | "goto" | "if" | "int" | "long" | "register" |
                      "return" | "short" | "signed" | "sizeof" | "static" | "struct" | "switch" | "typedef" | "union" |
                      "unsigned" | "void" | "volatile" | "while"
OPERADORES = "," | ";" | "?" | "||" | "&&" | "(" | ")" | "[" | "]" | "{" | "}" | ":" | "." | "++" | "--" | "~" | "#" |
             ( "*" | "+" | "-" | "/" | "!" | "=" | "<" | ">" | "%" | "&" |"^" | "|" | "<<" | ">>" | "-" ){0,1}={0,1}
COMENTARIO = {ComentarioNormal} | {ComentariodeLinea} | {ComentarioDocumental}
ComentarioNormal = "/*" [^*] ~"*/" | "/*" "*"+ "/"
ComentariodeLinea = "//" {CARACTER}* {FINDELINEA}?
ComentarioDocumental = "/**" {ContenioComentario} "*"+ "/"
ContenioComentario = ([^*]|\*+[^/*])*
%state STRING_STATE, COMENTARIO_STATE
%%
<YYINITIAL>{
    {ESPACIO} | {COMENTARIO} {/*Ignorar*/}
    "/*"        {yybegin(COMENTARIO_STATE);}
    {OPERADORES} { lexeme= lexema(OPERADOR,yytext()); return OPERADOR;}
    {PALABRAS_RESERVADAS} { lexeme= lexema(PALABRA_RESERVADA,yytext()); return PALABRA_RESERVADA;}
    {DIRECTIVAS} { lexeme= lexema(DIRECTIVA,yytext()); return DIRECTIVA;}
    \" {string = "\""; yybegin(STRING_STATE);}
    
    {CARACTER_C} { lexeme= lexema(LITERAL_CARACTER,yytext()); return LITERAL_CARACTER;}
    {NUMERO_ENTERO} { lexeme= lexema(LITERAL_ENTERO,yytext()); return LITERAL_ENTERO;}
    {NUMERO_FlOTANTE}  { lexeme= lexema(LITERAL_FLOAT,yytext()); return LITERAL_FLOAT;}
    {NUMERO_OCTAL} { lexeme= lexema(LITERAL_OCTAL,yytext()); return LITERAL_OCTAL;}
    {NUMERO_HEXADECIMAL}  { lexeme= lexema(LITERAL_HEXADECIMAL,yytext()); return LITERAL_HEXADECIMAL;}
    {ID} {lexeme = lexema(IDENTIFICADOR,yytext()); return IDENTIFICADOR;} 
    . | 0{NUMERO}* | {DIGITO}({DIGITO}|{LETRA})*  {lexeme = lexema(ERROR); return ERROR;}
}
<STRING_STATE>{
    {CARACTER}+  { string = string.concat(yytext());} 
    \"          { yybegin(YYINITIAL);string = string.concat(yytext());
                    lexeme = lexema(LITERAL_STRING,string); return LITERAL_STRING;}
    {FINDELINEA}     { yybegin(YYINITIAL); string.concat(yytext()); 
                    lexeme = lexema(ERROR,string); return ERROR;}
    <<EOF>>     { yybegin(YYINITIAL); string.concat(yytext()); 
                    lexeme = lexema(ERROR,string); return ERROR;}
}
<COMENTARIO_STATE>{
    [^*] {/*Ignorar*/}
    <<EOF>> { yybegin(YYINITIAL); lexeme = lexema(ERROR,yytext()); return ERROR;}
}