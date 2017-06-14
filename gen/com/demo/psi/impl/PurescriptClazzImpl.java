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

public class PurescriptClazzImpl extends ASTWrapperPsiElement implements PurescriptClazz {

  public PurescriptClazzImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PurescriptVisitor) ((PurescriptVisitor)visitor).visitClazz(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PurescriptAtype> getAtypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PurescriptAtype.class);
  }

  @Override
  @NotNull
  public PurescriptQtycls getQtycls() {
    return findNotNullChildByClass(PurescriptQtycls.class);
  }

  @Override
  @NotNull
  public List<PurescriptTyvar> getTyvarList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PurescriptTyvar.class);
  }

  @Override
  @NotNull
  public List<PurescriptVars> getVarsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PurescriptVars.class);
  }

}
