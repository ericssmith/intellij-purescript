package com.demo.psi;



import  com.intellij.extapi.psi.PsiFileBase ;
import  com.intellij.openapi.fileTypes.FileType ;
import  com.intellij.psi.FileViewProvider ;
import  com.demo.PurescriptFileType;
import  com.demo.PurescriptLanguage ;
import  org.jetbrains.annotations.NotNull ;

import javax.swing.*;

public class PurescriptFile extends PsiFileBase {
    public PurescriptFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, PurescriptLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return PurescriptFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Purescript File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
