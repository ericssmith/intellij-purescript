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

public class PurescriptTopdeclImpl extends ASTWrapperPsiElement implements PurescriptTopdecl {

  public PurescriptTopdeclImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PurescriptVisitor) ((PurescriptVisitor)visitor).visitTopdecl(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PurescriptClassdecl getClassdecl() {
    return findChildByClass(PurescriptClassdecl.class);
  }

  @Override
  @Nullable
  public PurescriptDatadecl getDatadecl() {
    return findChildByClass(PurescriptDatadecl.class);
  }

  @Override
  @Nullable
  public PurescriptDecl getDecl() {
    return findChildByClass(PurescriptDecl.class);
  }

  @Override
  @Nullable
  public PurescriptForimpdecl getForimpdecl() {
    return findChildByClass(PurescriptForimpdecl.class);
  }

  @Override
  @Nullable
  public PurescriptInstancedecl getInstancedecl() {
    return findChildByClass(PurescriptInstancedecl.class);
  }

  @Override
  @Nullable
  public PurescriptNewtypedecl getNewtypedecl() {
    return findChildByClass(PurescriptNewtypedecl.class);
  }

  @Override
  @Nullable
  public PurescriptTypedecl getTypedecl() {
    return findChildByClass(PurescriptTypedecl.class);
  }

}
