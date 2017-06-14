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

public class PurescriptGendeclImpl extends ASTWrapperPsiElement implements PurescriptGendecl {

  public PurescriptGendeclImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PurescriptVisitor) ((PurescriptVisitor)visitor).visitGendecl(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PurescriptFixity getFixity() {
    return findChildByClass(PurescriptFixity.class);
  }

  @Override
  @Nullable
  public PurescriptOps getOps() {
    return findChildByClass(PurescriptOps.class);
  }

  @Override
  @Nullable
  public PurescriptTypesigdecl getTypesigdecl() {
    return findChildByClass(PurescriptTypesigdecl.class);
  }

}
