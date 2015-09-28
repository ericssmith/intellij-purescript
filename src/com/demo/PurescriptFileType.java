package com.demo;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class PurescriptFileType extends LanguageFileType {
    public static final PurescriptFileType INSTANCE = new PurescriptFileType();

    private PurescriptFileType() {
        super(PurescriptLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Purescript file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Purescript language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "purs";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return PurescriptIcons.FILE;
    }

}
