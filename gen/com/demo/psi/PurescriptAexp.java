// This is a generated file. Not intended for manual editing.
package com.demo.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PurescriptAexp extends PsiElement {

  @Nullable
  PurescriptExp getExp();

  @Nullable
  PurescriptGcon getGcon();

  @Nullable
  PurescriptInfixexp getInfixexp();

  @Nullable
  PurescriptLambdaexp getLambdaexp();

  @Nullable
  PurescriptLiteral getLiteral();

  @Nullable
  PurescriptQcon getQcon();

  @Nullable
  PurescriptQop getQop();

  @NotNull
  List<PurescriptQvar> getQvarList();

  @Nullable
  PurescriptVar getVar();

}
