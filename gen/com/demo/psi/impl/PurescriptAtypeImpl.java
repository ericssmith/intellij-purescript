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

public class PurescriptAtypeImpl extends ASTWrapperPsiElement implements PurescriptAtype {

  public PurescriptAtypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PurescriptVisitor) ((PurescriptVisitor)visitor).visitAtype(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PurescriptGtycon getGtycon() {
    return findChildByClass(PurescriptGtycon.class);
  }

  @Override
  @Nullable
  public PurescriptRecConstr getRecConstr() {
    return findChildByClass(PurescriptRecConstr.class);
  }

  @Override
  @Nullable
  public PurescriptType getType() {
    return findChildByClass(PurescriptType.class);
  }

  @Override
  @Nullable
  public PurescriptTyvar getTyvar() {
    return findChildByClass(PurescriptTyvar.class);
  }

  @Override
  @Nullable
  public PurescriptVarop getVarop() {
    return findChildByClass(PurescriptVarop.class);
  }

}
