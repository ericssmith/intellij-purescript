// This is a generated file. Not intended for manual editing.
package com.demo.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PurescriptInfixexp extends PsiElement {

  @NotNull
  List<PurescriptFexp> getFexpList();

  @Nullable
  PurescriptInfixexp getInfixexp();

  @Nullable
  PurescriptLexp getLexp();

}
