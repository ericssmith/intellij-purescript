package com.demo;


import com.demo.psi.PurescriptTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class PurescriptSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final Map<IElementType, TextAttributesKey> ATTRIBUTES = new HashMap<IElementType, TextAttributesKey>();

//    public static final TextAttributesKey SEPARATOR = createTextAttributesKey("Purescript_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
//    public static final TextAttributesKey KEY = createTextAttributesKey("Purescript_KEY", DefaultLanguageHighlighterColors.KEYWORD);
//    public static final TextAttributesKey VALUE = createTextAttributesKey("Purescript_VALUE", DefaultLanguageHighlighterColors.STRING);

    public static final TextAttributesKey COMMENT = createTextAttributesKey("Purescript_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("Purescript_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    public static final TextAttributesKey STRING = createTextAttributesKey("Purescript_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("Purescript_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey OPERATOR = createTextAttributesKey("Purescript_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);

    public static final TextAttributesKey LITERAL = createTextAttributesKey("Purescript_LITERAL", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);



//    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
//    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
//    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};
//    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
//    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
//    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    static {
        fillMap(ATTRIBUTES, PurescriptParserDefinition.RESERVED_IDS, DefaultLanguageHighlighterColors.KEYWORD);
        fillMap(ATTRIBUTES, PurescriptParserDefinition.RESERVED_OPERATORS, DefaultLanguageHighlighterColors.OPERATION_SIGN);
        fillMap(ATTRIBUTES, PurescriptParserDefinition.STRINGS, DefaultLanguageHighlighterColors.STRING);
        fillMap(ATTRIBUTES, PurescriptParserDefinition.COMMENTS, DefaultLanguageHighlighterColors.LINE_COMMENT);

//        ATTRIBUTES.put(PurescriptTypes.PS_LITERAL, LITERAL);

    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new PurescriptLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {

        return pack(ATTRIBUTES.get(tokenType));

//        if (tokenType.equals(PurescriptTypes.SEPARATOR)) {
//            return SEPARATOR_KEYS;
//        } else if (tokenType.equals(PurescriptTypes.KEY)) {
//            return KEY_KEYS;
//        } else if (tokenType.equals(PurescriptTypes.VALUE)) {
//            return VALUE_KEYS;
//        } else if (tokenType.equals(PurescriptTypes.COMMENT)) {
//            return COMMENT_KEYS;
//        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
//            return BAD_CHAR_KEYS;
//        } else {
//            return EMPTY_KEYS;
//        }
    }


}