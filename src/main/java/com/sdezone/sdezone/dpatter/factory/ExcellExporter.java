package com.sdezone.sdezone.dpatter.factory;

public class ExcellExporter implements IFileExporter {

    @Override
    public String export(String content) {
        return "Excel ->" + content;
    }

}
