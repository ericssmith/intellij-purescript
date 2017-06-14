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

public class PurescriptClassdeclImpl extends ASTWrapperPsiElement implements PurescriptClassdecl {

  public PurescriptClassdeclImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PurescriptVisitor) ((PurescriptVisitor)visitor).visitClassdecl(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PurescriptCdecls> getCdeclsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PurescriptCdecls.class);
  }

  @Override
  @NotNull
  public PurescriptCon getCon() {
    return findNotNullChildByClass(PurescriptCon.class);
  }

  @Override
  @NotNull
  public List<PurescriptScontext> getScontextList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PurescriptScontext.class);
  }

  @Override
  @NotNull
  public List<PurescriptVar> getVarList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PurescriptVar.class);
  }

}
