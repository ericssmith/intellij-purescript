package com.demo;

import com.intellij.lang.Language;


public class PurescriptLanguage extends Language {
    public static final PurescriptLanguage INSTANCE = new PurescriptLanguage();

    private PurescriptLanguage() {
        super("Purescript");
    }

}
