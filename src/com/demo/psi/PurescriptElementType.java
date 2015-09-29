package com.demo.psi;

import com.demo.PurescriptLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class PurescriptElementType extends IElementType {
    public PurescriptElementType(@NotNull @NonNls String debugName) {
        super(debugName, PurescriptLanguage.INSTANCE);
    }
}
