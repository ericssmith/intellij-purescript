package com.demo.psi.impl;


import com.demo.psi.PurescriptElementFactory;
import com.demo.psi.PurescriptProperty;
import com.demo.psi.PurescriptTypes;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;

public class PurescriptPsiImplUtil {
    public static String getKey(PurescriptProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(PurescriptTypes.PS_KEY);
        if (keyNode != null) {
            return keyNode.getText();
        } else {
            return null;
        }
    }

    public static String getValue(PurescriptProperty element) {
        ASTNode valueNode = element.getNode().findChildByType(PurescriptTypes.PS_VALUE);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }


    public static String getName(PurescriptProperty element) {
        return getKey(element);
    }

    public static PsiElement setName(PurescriptProperty element, String newName) {
        ASTNode keyNode = element.getNode().findChildByType(PurescriptTypes.PS_KEY);
        if (keyNode != null) {

            PurescriptProperty property = PurescriptElementFactory.createProperty(element.getProject(), newName);
            ASTNode newKeyNode = property.getFirstChild().getNode();
            element.getNode().replaceChild(keyNode, newKeyNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(PurescriptProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(PurescriptTypes.PS_KEY);
        if (keyNode != null) {
            return keyNode.getPsi();
        } else {
            return null;
        }
    }
    
}