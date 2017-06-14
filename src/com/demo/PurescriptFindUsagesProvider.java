package com.demo;

import com.demo.psi.PurescriptProperty;
import com.demo.psi.PurescriptTypes;
import com.intellij.lang.cacheBuilder.DefaultWordsScanner;
import com.intellij.lang.cacheBuilder.WordsScanner;
import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PurescriptFindUsagesProvider implements FindUsagesProvider {
    private static final DefaultWordsScanner WORDS_SCANNER =
            new DefaultWordsScanner(new PurescriptLexerAdapter(),
                    TokenSet.create(PurescriptTypes.PS_KEY), TokenSet.create(PurescriptTypes.PS_COMMENT), TokenSet.EMPTY);

    @Nullable
    @Override
    public WordsScanner getWordsScanner() {
        return WORDS_SCANNER;
    }

    @Override
    public boolean canFindUsagesFor(@NotNull PsiElement psiElement) {
        return psiElement instanceof PsiNamedElement;
    }

    @Nullable
    @Override
    public String getHelpId(@NotNull PsiElement psiElement) {
        return null;
    }

    @NotNull
    @Override
    public String getType(@NotNull PsiElement element) {
        if (element instanceof PurescriptProperty) {
            return "simple property";
        } else {
            return "";
        }
    }

    @NotNull
    @Override
    public String getDescriptiveName(@NotNull PsiElement element) {
        if (element instanceof PurescriptProperty) {
            return ((PurescriptProperty) element).getKey();
        } else {
            return "";
        }
    }

    @NotNull
    @Override
    public String getNodeText(@NotNull PsiElement element, boolean useFullName) {
        if (element instanceof PurescriptProperty) {
            return ((PurescriptProperty) element).getKey() + ":" + ((PurescriptProperty) element).getValue();
        } else {
            return "";
        }
    }
}