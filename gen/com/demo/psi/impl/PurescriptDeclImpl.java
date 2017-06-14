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

public class PurescriptDeclImpl extends ASTWrapperPsiElement implements PurescriptDecl {

  public PurescriptDeclImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PurescriptVisitor) ((PurescriptVisitor)visitor).visitDecl(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PurescriptFunlhs getFunlhs() {
    return findChildByClass(PurescriptFunlhs.class);
  }

  @Override
  @Nullable
  public PurescriptFunrhs getFunrhs() {
    return findChildByClass(PurescriptFunrhs.class);
  }

  @Override
  @Nullable
  public PurescriptGendecl getGendecl() {
    return findChildByClass(PurescriptGendecl.class);
  }

}
