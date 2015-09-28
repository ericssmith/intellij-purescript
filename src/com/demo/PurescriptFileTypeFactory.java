package com.demo;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class PurescriptFileTypeFactory extends FileTypeFactory {

    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(PurescriptFileType.INSTANCE, "purs");
    }

}

