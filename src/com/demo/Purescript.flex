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

NEWLINE= \n|\r|\r\n
WHITE_SPACE=[\ \t\f]
FIRST_VALUE_CHARACTER=[^ \n\r\f\\] | "\\"{NEWLINE} | "\\".
VALUE_CHARACTER=[^\n\r\f\\] | "\\"{NEWLINE} | "\\".
END_OF_LINE_COMMENT=("#"|"!")[^\r\n]*
SEPARATOR=[:=]
KEY_CHARACTER=[^:=\ \n\r\t\f\\] | "\\"{NEWLINE} | "\\".

SMALL=[a-z_]
LARGE=[A-Z]
DIGIT=[0-9]
QUOTE="'"
HASH="#"
DOT="."

EQUAL="="
VERTICAL_BAR="|"


COLON_COLON="::"
LEFT_ARROW="<-"
RIGHT_ARROW="->"


VAR_ID = {SMALL} ({SMALL} | {LARGE} | {DIGIT} | {QUOTE})* {HASH}*
CON_ID = {LARGE} ({SMALL} | {LARGE} | {DIGIT} | {QUOTE})* {HASH}*

GAP =  \\({WHITE_SPACE}|{NEWLINE})*\\
//cntrl               = {LARGE} | [@\[\\\]\^_]
//charesc             = [abfnrtv\\\"\'&]
//ascii               = ("^"{cntrl})|(NUL)|(SOH)|(STX)|(ETX)|(EOT)|(ENQ)|(ACK)|(BEL)|(BS)|(HT)|(LF)|(VT)|(FF)|(CR)|(SO)|(SI)|(DLE)|(DC1)|(DC2)|(DC3)|(DC4)|(NAK)|(SYN)|(ETB)|(CAN)|(EM)|(SUB)|(ESC)|(FS)|(GS)|(RS)|(US)|(SP)|(DEL)
//escape              = \\({charesc}|{ascii}|({digit}+)|(o({octit}+))|(x({hexit}+)))
//STRING_LITERAL = \"([^\"\\\n]|{escape}|{gap})*(\"|\n)
STRING_LITERAL = \"([^\"\\\n]|{GAP})*(\"|\n)

%state WAITING_VALUE

%%

//<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return PurescriptTypes.PS_COMMENT; }
{END_OF_LINE_COMMENT}                           { return PurescriptTypes.PS_COMMENT; }

"module"   { return PurescriptTypes.PS_MODULE; }
"where"   { return PurescriptTypes.PS_WHERE; }
"import" {return PurescriptTypes.PS_IMPORT;}
"do" {return PurescriptTypes.PS_DO;}



{VAR_ID} { return PurescriptTypes.PS_VARID_ID;}
{CON_ID} { return PurescriptTypes.PS_CONID_ID;}


{STRING_LITERAL} {return PurescriptTypes.PS_STRING_LITERAL;}


{DOT} {return PurescriptTypes.PS_DOT;}
{QUOTE} {return PurescriptTypes.PS_QUOTE;}

{COLON_COLON} {return PurescriptTypes.PS_COLON_COLON;}
{LEFT_ARROW} {return PurescriptTypes.PS_LEFT_ARROW;}
{RIGHT_ARROW} {return PurescriptTypes.PS_RIGHT_ARROW;}

{EQUAL} {return PurescriptTypes.PS_EQUAL;}
{VERTICAL_BAR} {return PurescriptTypes.PS_VERTICAL_BAR;}




// Keep old entries so tutorial references continue to work
{KEY_CHARACTER} {return PurescriptTypes.PS_KEY;}
{SEPARATOR} {return PurescriptTypes.PS_SEPARATOR;}
{FIRST_VALUE_CHARACTER} {return PurescriptTypes.PS_VALUE;}


//<YYINITIAL> {KEY_CHARACTER}+                                { yybegin(YYINITIAL); return PurescriptTypes.KEY; }
//<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_VALUE); return PurescriptTypes.SEPARATOR; }
//< WAITING_VALUE >  { NEWLINE }                                      {  yybegin ( YYINITIAL );  return  PurescriptTypes . NEWLINE ;  }
//<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }
//<WAITING_VALUE> {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*    { yybegin(YYINITIAL); return PurescriptTypes.VALUE; }

{ NEWLINE }                                                      {  yybegin ( YYINITIAL );  return  PurescriptTypes . PS_NEWLINE ;  }

{WHITE_SPACE}+                                              { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }



.                                                           { return TokenType.BAD_CHARACTER; }