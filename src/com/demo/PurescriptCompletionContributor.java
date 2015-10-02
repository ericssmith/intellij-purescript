package com.demo;

import  com.intellij.codeInsight.completion.* ;
import  com.intellij.codeInsight.lookup.LookupElementBuilder ;
import  com.intellij.patterns.PlatformPatterns ;
import  com.intellij.util.ProcessingContext ;
import  com.demo.psi.PurescriptTypes ;
import  org.jetbrains.annotations.NotNull ;

public class PurescriptCompletionContributor extends CompletionContributor {
    public PurescriptCompletionContributor() {
        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement(PurescriptTypes.PS_VALUE).withLanguage(PurescriptLanguage.INSTANCE),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("Hello"));
                    }
                }
        );
    }
}
