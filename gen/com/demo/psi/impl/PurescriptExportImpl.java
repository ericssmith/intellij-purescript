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

public class PurescriptExportImpl extends ASTWrapperPsiElement implements PurescriptExport {

  public PurescriptExportImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PurescriptVisitor) ((PurescriptVisitor)visitor).visitExport(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PurescriptExport1 getExport1() {
    return findChildByClass(PurescriptExport1.class);
  }

  @Override
  @Nullable
  public PurescriptExport2 getExport2() {
    return findChildByClass(PurescriptExport2.class);
  }

  @Override
  @Nullable
  public PurescriptExport3 getExport3() {
    return findChildByClass(PurescriptExport3.class);
  }

  @Override
  @Nullable
  public PurescriptExport4 getExport4() {
    return findChildByClass(PurescriptExport4.class);
  }

}
