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

public class PurescriptAltImpl extends ASTWrapperPsiElement implements PurescriptAlt {

  public PurescriptAltImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PurescriptVisitor) ((PurescriptVisitor)visitor).visitAlt(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PurescriptDecls> getDeclsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PurescriptDecls.class);
  }

  @Override
  @Nullable
  public PurescriptExp getExp() {
    return findChildByClass(PurescriptExp.class);
  }

  @Override
  @Nullable
  public PurescriptGdpat getGdpat() {
    return findChildByClass(PurescriptGdpat.class);
  }

  @Override
  @NotNull
  public PurescriptPat getPat() {
    return findNotNullChildByClass(PurescriptPat.class);
  }

}
