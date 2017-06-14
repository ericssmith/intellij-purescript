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

public class PurescriptImpspecImpl extends ASTWrapperPsiElement implements PurescriptImpspec {

  public PurescriptImpspecImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PurescriptVisitor) ((PurescriptVisitor)visitor).visitImpspec(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PurescriptImport0> getImport0List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PurescriptImport0.class);
  }

}
