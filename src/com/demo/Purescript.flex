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

CON_ID = {LARGE} ({SMALL} | {LARGE} | {DIGIT} | {QUOTE})* {HASH}*



%state WAITING_VALUE

%%

//<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return PurescriptTypes.PS_COMMENT; }
{END_OF_LINE_COMMENT}                           { return PurescriptTypes.PS_COMMENT; }

"module"   { return PurescriptTypes.PS_MODULE; }
"where"   { return PurescriptTypes.PS_WHERE; }

{CON_ID} { return PurescriptTypes.PS_CON_ID;}
{DOT} {return PurescriptTypes.PS_DOT;}
{QUOTE} {return PurescriptTypes.PS_QUOTE;}


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