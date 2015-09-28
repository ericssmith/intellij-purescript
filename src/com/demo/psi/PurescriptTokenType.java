package com.demo.psi;

import com.demo.PurescriptLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class PurescriptTokenType extends IElementType {
    public PurescriptTokenType(@NotNull @NonNls String debugName) {
        super(debugName, PurescriptLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "PurescriptTokenType." + super.toString();
    }
}
