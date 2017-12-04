package com.nablarch.etl.designer.util;

/**
 * author yoshinouchi.ryota
 */
public class ExtensionChanger {
    public String changeExtension(String fileName, String ext) {
        int index = fileName.lastIndexOf('.');
        if (index!=-1) {
            return fileName.substring(0, index) + ext;
        }
        return "";
    }
}
