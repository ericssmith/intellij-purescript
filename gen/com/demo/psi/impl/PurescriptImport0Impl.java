// This is a generated file. Not intended for manual editing.
package com.demo.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.demo.psi.PurescriptTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.demo.psi.*;

public class PurescriptImport0Impl extends ASTWrapperPsiElement implements PurescriptImport0 {

  public PurescriptImport0Impl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PurescriptVisitor) ((PurescriptVisitor)visitor).visitImport0(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PurescriptImport1 getImport1() {
    return findChildByClass(PurescriptImport1.class);
  }

  @Override
  @Nullable
  public PurescriptImport2 getImport2() {
    return findChildByClass(PurescriptImport2.class);
  }

}
