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

public class PurescriptSimpleclassImpl extends ASTWrapperPsiElement implements PurescriptSimpleclass {

  public PurescriptSimpleclassImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PurescriptVisitor) ((PurescriptVisitor)visitor).visitSimpleclass(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PurescriptQcon getQcon() {
    return findNotNullChildByClass(PurescriptQcon.class);
  }

  @Override
  @NotNull
  public List<PurescriptQvar> getQvarList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PurescriptQvar.class);
  }

}
