package com.demo.psi;

import  com.intellij.openapi.project.Project ;
import  com.intellij.psi.PsiFileFactory ;
import  com.demo.PurescriptFileType ;

public class PurescriptElementFactory {
    public static PurescriptProperty createProperty(Project project, String name) {
        final PurescriptFile file = createFile(project, name);
        return (PurescriptProperty) file.getFirstChild();
    }

    public static PurescriptFile createFile(Project project, String text) {
        String name = "dummy.purs";
        return (PurescriptFile) PsiFileFactory.getInstance(project).
                createFileFromText(name, PurescriptFileType.INSTANCE, text);
    }
}
