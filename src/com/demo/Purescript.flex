package  com.demo;

import  com.intellij.lexer.FlexLexer ;
import  com.intellij.psi.tree.IElementType ;
import  com.demo.psi.PurescriptTypes ;
import  com.intellij.psi.TokenType ;

%%

%class PurescriptLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

%{
    private int commentStart;
    private int commentDepth;
%}

%xstate NCOMMENT, TEX


NEWLINE= \n|\r|\r\n
WHITE_SPACE=[\ \t\f]
FIRST_VALUE_CHARACTER=[^ \n\r\f\\] | "\\"{NEWLINE} | "\\".
VALUE_CHARACTER=[^\n\r\f\\] | "\\"{NEWLINE} | "\\".
END_OF_LINE_COMMENT=("#"|"!")[^\r\n]*
SEPARATOR=[:=]
KEY_CHARACTER=[^:=\ \n\r\t\f\\] | "\\"{NEWLINE} | "\\".

COMMENT             = ("--"[^\r\n]* | "\\begin{code}")
NCOMMENT_START      = "{-"
NCOMMENT_END        = "-}"

SMALL=[a-z_]
LARGE=[A-Z]
DIGIT=[0-9]



QUOTE="'"


EXCLAMATION_MARK = "!"
HASH="#"
DOLLAR = "$"
PERCENTAGE = "%"
AMPERSAND = "&"
STAR = "*"
PLUS = "+"
DOT="."
SLASH = "/"
LT = "<"
GT = ">"
QUESTION_MARK = "?"
CARET = "^"
DASH = "-"


EQUAL="="
AT = "@"
BACKSLASH = "\\"
VERTICAL_BAR="|"
TILDE = "~"
COLON = ":"


UNDERSCORE = "_"




COLON_COLON="::"
LEFT_ARROW="<-"
RIGHT_ARROW="->"
DOUBLE_RIGHT_ARROW = "=>"
DOUBLE_LEFT_ARROW = "<="

LEFT_PAREN = "("
RIGHT_PAREN = ")"
COMMA = ","
SEMICOLON = ";"
LEFT_BRACKET = "["
RIGHT_BRACKET = "]"
BACKTICK = "`"
LEFT_BRACE = "{"
RIGHT_BRACE = "}"




SYMBOL_NO_COLON_DOT = {EQUAL} | {AT} | {BACKSLASH} | {VERTICAL_BAR} | {TILDE} | {EXCLAMATION_MARK} | {HASH} | {DOLLAR} | {AMPERSAND} | {STAR} | {PLUS} | {SLASH} | {LT} | {GT} | {QUESTION_MARK} | {CARET} | {DASH}

VARID = {SMALL} ({SMALL} | {LARGE} | {DIGIT} | {QUOTE})* {HASH}*
VARSYMID = {SYMBOL_NO_COLON_DOT} ({SYMBOL_NO_COLON_DOT} | {DOT} | {COLON})*

CONID = {LARGE} ({SMALL} | {LARGE} | {DIGIT} | {QUOTE})* {HASH}*
//CONSYMID = ....

GAP =  \\({WHITE_SPACE}|{NEWLINE})*\\
//cntrl               = {LARGE} | [@\[\\\]\^_]
//charesc             = [abfnrtv\\\"\'&]
//ascii               = ("^"{cntrl})|(NUL)|(SOH)|(STX)|(ETX)|(EOT)|(ENQ)|(ACK)|(BEL)|(BS)|(HT)|(LF)|(VT)|(FF)|(CR)|(SO)|(SI)|(DLE)|(DC1)|(DC2)|(DC3)|(DC4)|(NAK)|(SYN)|(ETB)|(CAN)|(EM)|(SUB)|(ESC)|(FS)|(GS)|(RS)|(US)|(SP)|(DEL)
//escape              = \\({charesc}|{ascii}|({digit}+)|(o({octit}+))|(x({hexit}+)))
//STRING_LITERAL = \"([^\"\\\n]|{escape}|{gap})*(\"|\n)
STRING = \"([^\"\\\n]|{GAP})*(\"|\n)

%state WAITING_VALUE

%%


<TEX> {
    [^\\]+            { return PurescriptTypes.PS_NCOMMENT; }
    "\\begin{code}"   { yybegin(YYINITIAL); return PurescriptTypes.PS_NCOMMENT; }
    \\+*              { return PurescriptTypes.PS_NCOMMENT; }
}

<NCOMMENT> {
    {NCOMMENT_START} ({NEWLINE}| {WHITE_SPACE} | {VERTICAL_BAR} | {SMALL} | {LARGE} | {DIGIT} | {DASH})? {
        commentDepth++;
    }

    <<EOF>> {
        int state = yystate();
        yybegin(YYINITIAL);
        zzStartRead = commentStart;
        return PurescriptTypes.PS_NCOMMENT;
    }

    {NCOMMENT_END} {NEWLINE}? {
        if (commentDepth > 0) {
            commentDepth--;
        }
        else {
             int state = yystate();
             yybegin(YYINITIAL);
             zzStartRead = commentStart;
             return PurescriptTypes.PS_NCOMMENT;
        }
    }

    .|{WHITE_SPACE}|{NEWLINE} {}
}

{NCOMMENT_START} ({VERTICAL_BAR} | {NEWLINE} | {WHITE_SPACE} | {SMALL} | {LARGE} | {DIGIT} | {DASH}) {
    yybegin(NCOMMENT);
    commentDepth = 0;
    commentStart = getTokenStart();
}


//<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return PurescriptTypes.PS_COMMENT; }
{END_OF_LINE_COMMENT}                           { return PurescriptTypes.PS_COMMENT; }



{COMMENT}             { return PurescriptTypes.PS_COMMENT; }
{NCOMMENT_START}      { return PurescriptTypes.PS_NCOMMENT_START; }
{NCOMMENT_END}        { return PurescriptTypes.PS_NCOMMENT_END; }


"module"   { return PurescriptTypes.PS_MODULE; }
"where"   { return PurescriptTypes.PS_WHERE; }
"import" {return PurescriptTypes.PS_IMPORT;}
"type" {return PurescriptTypes.PS_TYPEID;}
"data" {return PurescriptTypes.PS_DATA;}
"newtype" {return PurescriptTypes.PS_NEWTYPE;}
"class" {return PurescriptTypes.PS_CLASS;}
"instance" {return PurescriptTypes.PS_INSTANCE;}
"do" {return PurescriptTypes.PS_DO;}
"foreign" {return PurescriptTypes.PS_FOREIGN;}
"forall" {return PurescriptTypes.PS_FORALL;}
"let" {return PurescriptTypes.PS_LET;}
"in" {return PurescriptTypes.PS_IN;}
"then" {return PurescriptTypes.PS_THEN;}
"else" {return PurescriptTypes.PS_ELSE;}
"of" {return PurescriptTypes.PS_OF;}
"qualified" {return PurescriptTypes.PS_QUALIFIED;}






{STRING} {return PurescriptTypes.PS_STRING;}


{DOT} {return PurescriptTypes.PS_DOT;}
{QUOTE} {return PurescriptTypes.PS_QUOTE;}

{COLON_COLON} {return PurescriptTypes.PS_COLON_COLON;}
{LEFT_ARROW} {return PurescriptTypes.PS_LEFT_ARROW;}
{RIGHT_ARROW} {return PurescriptTypes.PS_RIGHT_ARROW;}
{DOUBLE_RIGHT_ARROW} {return PurescriptTypes.PS_DOUBLE_RIGHT_ARROW;}
{DOUBLE_LEFT_ARROW} {return PurescriptTypes.PS_DOUBLE_LEFT_ARROW;}

{LEFT_PAREN} {return PurescriptTypes.PS_LEFT_PAREN;}
{RIGHT_PAREN} {return PurescriptTypes.PS_RIGHT_PAREN;}
{COMMA} {return PurescriptTypes.PS_COMMA;}
//{SEMICOLON} {return PurescriptTypes.PS_SEMICOLON;}
{LEFT_BRACKET} {return PurescriptTypes.PS_LEFT_BRACKET;}
{RIGHT_BRACKET} {return PurescriptTypes.PS_RIGHT_BRACKET;}
{BACKTICK} {return PurescriptTypes.PS_BACKTICK;}
{LEFT_BRACE} {return PurescriptTypes.PS_LEFT_BRACE;}
{RIGHT_BRACE} {return PurescriptTypes.PS_RIGHT_BRACE;}




{EQUAL} {return PurescriptTypes.PS_EQUAL;}
{AT} {return PurescriptTypes.PS_AT;}
{VERTICAL_BAR} {return PurescriptTypes.PS_VERTICAL_BAR;}

{UNDERSCORE} {return PurescriptTypes.PS_UNDERSCORE;}

{VARID} { return PurescriptTypes.PS_VARID;}
{CONID} { return PurescriptTypes.PS_CONID;}
{VARSYMID} { return PurescriptTypes.PS_VARSYMID;}


// Keep old entries so tutorial references continue to work
{KEY_CHARACTER} {return PurescriptTypes.PS_KEY;}
{SEPARATOR} {return PurescriptTypes.PS_SEPARATOR;}
{FIRST_VALUE_CHARACTER} {return PurescriptTypes.PS_VALUE;}


//<YYINITIAL> {KEY_CHARACTER}+                                { yybegin(YYINITIAL); return PurescriptTypes.KEY; }
//<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_VALUE); return PurescriptTypes.SEPARATOR; }
//< WAITING_VALUE >  { NEWLINE }                                      {  yybegin ( YYINITIAL );  return  PurescriptTypes . NEWLINE ;  }
//<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }
//<WAITING_VALUE> {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*    { yybegin(YYINITIAL); return PurescriptTypes.VALUE; }

{ NEWLINE }                                                      {  yybegin ( YYINITIAL );  return  PurescriptTypes.PS_NEWLINE ;  }

{WHITE_SPACE}+                                              { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }



.                                                           { return TokenType.BAD_CHARACTER; }