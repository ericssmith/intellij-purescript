package com.demo;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class PurescriptLexerAdapter extends FlexAdapter {
    public PurescriptLexerAdapter() {
        super(new PurescriptLexer((Reader) null));
    }
}
