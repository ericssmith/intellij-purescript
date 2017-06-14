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

public class PurescriptAexpImpl extends ASTWrapperPsiElement implements PurescriptAexp {

  public PurescriptAexpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PurescriptVisitor) ((PurescriptVisitor)visitor).visitAexp(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PurescriptExp getExp() {
    return findChildByClass(PurescriptExp.class);
  }

  @Override
  @Nullable
  public PurescriptGcon getGcon() {
    return findChildByClass(PurescriptGcon.class);
  }

  @Override
  @Nullable
  public PurescriptInfixexp getInfixexp() {
    return findChildByClass(PurescriptInfixexp.class);
  }

  @Override
  @Nullable
  public PurescriptLambdaexp getLambdaexp() {
    return findChildByClass(PurescriptLambdaexp.class);
  }

  @Override
  @Nullable
  public PurescriptLiteral getLiteral() {
    return findChildByClass(PurescriptLiteral.class);
  }

  @Override
  @Nullable
  public PurescriptQcon getQcon() {
    return findChildByClass(PurescriptQcon.class);
  }

  @Override
  @Nullable
  public PurescriptQop getQop() {
    return findChildByClass(PurescriptQop.class);
  }

  @Override
  @NotNull
  public List<PurescriptQvar> getQvarList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PurescriptQvar.class);
  }

  @Override
  @Nullable
  public PurescriptVar getVar() {
    return findChildByClass(PurescriptVar.class);
  }

}
