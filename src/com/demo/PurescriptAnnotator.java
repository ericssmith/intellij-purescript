package com.demo;

import com.demo.psi.*;
import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.EditorColorsManager;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.TextAttributes;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLiteralExpression;
import org.jetbrains.annotations.NotNull;

import com.intellij.psi.PsiElement;
import static com.intellij.patterns.PlatformPatterns.psiElement;

import java.util.List;

public class PurescriptAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull final PsiElement element, @NotNull final AnnotationHolder holder) {

        element.accept(new PurescriptVisitor() {
           @Override
           public void visitLiteral(@NotNull PurescriptLiteral o) {
               super.visitLiteral(o);
               setHighlighting(o, holder, PurescriptSyntaxHighlighter.LITERAL);
           }
        });


//        if (element instanceof PsiLiteralExpression) {
//            PsiLiteralExpression literalExpression = (PsiLiteralExpression) element;
//            String value = (String) literalExpression.getValue();
//            if (value != null && value.startsWith("simple:")) {
//                Project project = element.getProject();
//                String key = value.substring(7);
//                List<PurescriptProperty> properties = PurescriptUtil.findProperties(project, key);
//                if (properties.size() == 1) {
//                    TextRange range = new TextRange(element.getTextRange().getStartOffset() + 7,
//                            element.getTextRange().getStartOffset() + 7);
//                    Annotation annotation = holder.createInfoAnnotation(range, null);
//                    annotation.setTextAttributes(DefaultLanguageHighlighterColors.LINE_COMMENT);
//                } else if (properties.size() == 0) {
//                    TextRange range = new TextRange(element.getTextRange().getStartOffset() + 8,
//                            element.getTextRange().getEndOffset());
//                    holder.createErrorAnnotation(range, "Unresolved property");
//                }
//            }
//        }
    }

    private static void setHighlighting(@NotNull PsiElement element, @NotNull AnnotationHolder holder,
                                        @NotNull TextAttributesKey key) {
        holder.createInfoAnnotation(element, null).setEnforcedTextAttributes(TextAttributes.ERASE_MARKER);
        holder.createInfoAnnotation(element, null).setEnforcedTextAttributes(
                EditorColorsManager.getInstance().getGlobalScheme().getAttributes(key));
    }
}
