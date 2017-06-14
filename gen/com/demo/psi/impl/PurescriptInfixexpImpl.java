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

public class PurescriptInfixexpImpl extends ASTWrapperPsiElement implements PurescriptInfixexp {

  public PurescriptInfixexpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PurescriptVisitor) ((PurescriptVisitor)visitor).visitInfixexp(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PurescriptFexp> getFexpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PurescriptFexp.class);
  }

  @Override
  @Nullable
  public PurescriptInfixexp getInfixexp() {
    return findChildByClass(PurescriptInfixexp.class);
  }

  @Override
  @Nullable
  public PurescriptLexp getLexp() {
    return findChildByClass(PurescriptLexp.class);
  }

}
