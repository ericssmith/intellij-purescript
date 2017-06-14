// This is a generated file. Not intended for manual editing.
package com.demo.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PurescriptApat extends PsiElement {

  @NotNull
  List<PurescriptApat> getApatList();

  @NotNull
  List<PurescriptExp> getExpList();

  @Nullable
  PurescriptGcon getGcon();

  @Nullable
  PurescriptLiteral getLiteral();

  @Nullable
  PurescriptPat getPat();

  @Nullable
  PurescriptQcon getQcon();

  @Nullable
  PurescriptVar getVar();

}
