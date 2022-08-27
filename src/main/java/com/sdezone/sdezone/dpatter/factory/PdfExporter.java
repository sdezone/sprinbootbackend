package com.sdezone.sdezone.dpatter.factory;

public class PdfExporter implements IFileExporter {

    @Override
    public String export(String content) {
        return "Pdf ->" + content;
    }

}
