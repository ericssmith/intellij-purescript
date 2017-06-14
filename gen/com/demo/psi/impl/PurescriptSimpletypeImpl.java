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

public class PurescriptSimpletypeImpl extends ASTWrapperPsiElement implements PurescriptSimpletype {

  public PurescriptSimpletypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PurescriptVisitor) ((PurescriptVisitor)visitor).visitSimpletype(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PurescriptQcon getQcon() {
    return findChildByClass(PurescriptQcon.class);
  }

  @Override
  @Nullable
  public PurescriptType getType() {
    return findChildByClass(PurescriptType.class);
  }

  @Override
  @NotNull
  public List<PurescriptVar> getVarList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PurescriptVar.class);
  }

}
