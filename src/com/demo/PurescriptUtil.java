package com.demo;

import com.demo.psi.PurescriptProperty;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;
import com.demo.psi.PurescriptFile;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PurescriptUtil {
    public static List<PurescriptProperty> findProperties(Project project, String key) {
        List<PurescriptProperty> result = null;
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, PurescriptFileType.INSTANCE,
                GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            PurescriptFile simpleFile = (PurescriptFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                PurescriptProperty[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, PurescriptProperty.class);
                if (properties != null) {
                    for (PurescriptProperty property : properties) {
                        if (key.equals(property.getKey())) {
                            if (result == null) {
                                result = new ArrayList<PurescriptProperty>();
                            }
                            result.add(property);
                        }
                    }
                }
            }
        }
        return result != null ? result : Collections.<PurescriptProperty>emptyList();
    }

    public static List<PurescriptProperty> findProperties(Project project) {
        List<PurescriptProperty> result = new ArrayList<PurescriptProperty>();
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, PurescriptFileType.INSTANCE,
                GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            PurescriptFile simpleFile = (PurescriptFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                PurescriptProperty[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, PurescriptProperty.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }
}
