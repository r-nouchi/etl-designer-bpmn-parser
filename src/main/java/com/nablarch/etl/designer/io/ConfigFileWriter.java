package com.nablarch.etl.designer.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * author yoshinouchi.ryota
 */
public class ConfigFileWriter {
    public void writeFile (String fileName, String content) throws IOException {
        File file = new File(fileName);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        pw.println(content);
        pw.close();
    }
}
