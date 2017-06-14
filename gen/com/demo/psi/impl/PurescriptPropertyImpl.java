// This is a generated file. Not intended for manual editing.
package com.demo.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.demo.psi.PurescriptTypes.*;
import com.demo.psi.*;

public class PurescriptPropertyImpl extends PurescriptNamedElementImpl implements PurescriptProperty {

  public PurescriptPropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PurescriptVisitor) ((PurescriptVisitor)visitor).visitProperty(this);
    else super.accept(visitor);
  }

  public String getKey() {
    return PurescriptPsiImplUtil.getKey(this);
  }

  public String getValue() {
    return PurescriptPsiImplUtil.getValue(this);
  }

  public String getName() {
    return PurescriptPsiImplUtil.getName(this);
  }

  public PsiElement setName(String newName) {
    return PurescriptPsiImplUtil.setName(this, newName);
  }

  public PsiElement getNameIdentifier() {
    return PurescriptPsiImplUtil.getNameIdentifier(this);
  }

}
