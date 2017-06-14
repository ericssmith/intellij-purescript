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

public class PurescriptApatImpl extends ASTWrapperPsiElement implements PurescriptApat {

  public PurescriptApatImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PurescriptVisitor) ((PurescriptVisitor)visitor).visitApat(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PurescriptApat> getApatList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PurescriptApat.class);
  }

  @Override
  @NotNull
  public List<PurescriptExp> getExpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PurescriptExp.class);
  }

  @Override
  @Nullable
  public PurescriptGcon getGcon() {
    return findChildByClass(PurescriptGcon.class);
  }

  @Override
  @Nullable
  public PurescriptLiteral getLiteral() {
    return findChildByClass(PurescriptLiteral.class);
  }

  @Override
  @Nullable
  public PurescriptPat getPat() {
    return findChildByClass(PurescriptPat.class);
  }

  @Override
  @Nullable
  public PurescriptQcon getQcon() {
    return findChildByClass(PurescriptQcon.class);
  }

  @Override
  @Nullable
  public PurescriptVar getVar() {
    return findChildByClass(PurescriptVar.class);
  }

}
