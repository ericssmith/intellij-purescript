package com.demo.psi.impl;


import com.intellij.lang.ASTNode;
import com.demo.psi.PurescriptProperty;
import com.demo.psi.PurescriptTypes;

public class PurescriptPsiImplUtil {
    public static String getKey(PurescriptProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(PurescriptTypes.KEY);
        if (keyNode != null) {
            return keyNode.getText();
        } else {
            return null;
        }
    }

    public static String getValue(PurescriptProperty element) {
        ASTNode valueNode = element.getNode().findChildByType(PurescriptTypes.VALUE);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }
}