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

public class PurescriptLexpImpl extends ASTWrapperPsiElement implements PurescriptLexp {

  public PurescriptLexpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PurescriptVisitor) ((PurescriptVisitor)visitor).visitLexp(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PurescriptCaseexp getCaseexp() {
    return findChildByClass(PurescriptCaseexp.class);
  }

  @Override
  @Nullable
  public PurescriptDoexp getDoexp() {
    return findChildByClass(PurescriptDoexp.class);
  }

  @Override
  @Nullable
  public PurescriptFexp getFexp() {
    return findChildByClass(PurescriptFexp.class);
  }

  @Override
  @Nullable
  public PurescriptIfexp getIfexp() {
    return findChildByClass(PurescriptIfexp.class);
  }

  @Override
  @Nullable
  public PurescriptLambdaexp getLambdaexp() {
    return findChildByClass(PurescriptLambdaexp.class);
  }

  @Override
  @Nullable
  public PurescriptLetexp getLetexp() {
    return findChildByClass(PurescriptLetexp.class);
  }

}
