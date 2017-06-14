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

public class PurescriptConstrImpl extends ASTWrapperPsiElement implements PurescriptConstr {

  public PurescriptConstrImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PurescriptVisitor) ((PurescriptVisitor)visitor).visitConstr(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PurescriptCon getCon() {
    return findChildByClass(PurescriptCon.class);
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

}
