package com.demo;

import com.demo.psi.PurescriptTypes;
import com.intellij.lang.ParserDefinition;
import  com.intellij.lang.ASTNode ;
import  com.intellij.lang.Language ;
import  com.intellij.lang.PsiParser ;
import  com.intellij.lexer.Lexer ;
import  com.intellij.openapi.project.Project ;
import  com.intellij.psi.FileViewProvider ;
import  com.intellij.psi.PsiElement ;
import  com.intellij.psi.PsiFile ;
import  com.intellij.psi.TokenType ;
import  com.intellij.psi.tree.IFileElementType ;
import  com.intellij.psi.tree.TokenSet ;
import  com.demo.parser.PurescriptParser ;
import  com.demo.psi.PurescriptFile ;
import  org.jetbrains.annotations.NotNull ;


public class PurescriptParserDefinition implements ParserDefinition {
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(PurescriptTypes.PS_COMMENT);

    public static final TokenSet RESERVED_IDS = TokenSet.create(PurescriptTypes.PS_MODULE, PurescriptTypes.PS_WHERE,
            PurescriptTypes.PS_IMPORT, PurescriptTypes.PS_DO, PurescriptTypes.PS_KEY);

    public static final TokenSet RESERVED_OPERATORS = TokenSet.create(PurescriptTypes.PS_DOT, PurescriptTypes.PS_EQUAL,
            PurescriptTypes.PS_VERTICAL_BAR);


    public static final TokenSet STRINGS = TokenSet.create(PurescriptTypes.PS_STRING_LITERAL, PurescriptTypes.PS_VALUE);

    public static final IFileElementType FILE = new IFileElementType(Language.<PurescriptLanguage>findInstance(PurescriptLanguage.class));

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new PurescriptLexerAdapter();
    }

    @NotNull
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    public  TokenSet  getCommentTokens ()
    {
        return COMMENTS;
    }

    @NotNull
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    public PsiParser createParser(final Project project) {
        return new PurescriptParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    public PsiFile createFile(FileViewProvider viewProvider) {
        return new PurescriptFile(viewProvider);
    }

    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @NotNull
    public PsiElement createElement(ASTNode node) {
        return PurescriptTypes.Factory.createElement(node);
    }
}
