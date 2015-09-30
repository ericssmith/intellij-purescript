package com.demo.psi.impl;


import  com.intellij.extapi.psi.ASTWrapperPsiElement ;
import  com.intellij.lang.ASTNode ;
import  com.demo.psi.PurescriptNamedElement ;
import  org.jetbrains.annotations.NotNull ;

public abstract class PurescriptNamedElementImpl extends ASTWrapperPsiElement implements PurescriptNamedElement {
    public PurescriptNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}