package com.demo;


import com.intellij.ide.todo.AllTodosTreeStructure;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class PurescriptColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
//            new AttributesDescriptor("Key", PurescriptSyntaxHighlighter.KEY),
//            new AttributesDescriptor("Separator", PurescriptSyntaxHighlighter.SEPARATOR),
//            new AttributesDescriptor("Value", PurescriptSyntaxHighlighter.VALUE),


            new AttributesDescriptor("String", PurescriptSyntaxHighlighter.STRING),
            new AttributesDescriptor("Comment", PurescriptSyntaxHighlighter.COMMENT),
            new AttributesDescriptor("Keyword", PurescriptSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Bad Character", PurescriptSyntaxHighlighter.BAD_CHARACTER),
            new AttributesDescriptor("Operator", PurescriptSyntaxHighlighter.OPERATOR),
            new AttributesDescriptor("Literal", PurescriptSyntaxHighlighter.LITERAL)

    };

    @Nullable
    @Override
    public Icon getIcon() {
        return PurescriptIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new PurescriptSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "module Main where\n" +
                "\n" +
                "import Control.Monad.Eff.Console\n" +
                "import Control.Monad.Eff\n" +
                "\n" +
                "main :: forall e. Signal (Eff e Unit) -> Eff e Unit\n" +
                "main = do\n" +
                "    log \"Hello Sailer\"";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }


    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Purescript";
    }
}