package com.nablarch.etl.designer;

import com.nablarch.etl.designer.io.ConfigFileWriter;
import com.nablarch.etl.designer.parser.BpmnParser;
import com.nablarch.etl.designer.io.BpmnFileReader;
import com.nablarch.etl.designer.util.ExtensionChanger;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * author yoshinouchi.ryota
 */
public class parserMain {
    public static void main(String[] args) throws IOException {
        if(args.length != 1){
            System.exit(1);
        }

        String xmlString = new BpmnFileReader().readFile(args[0]);
        BpmnParser parser = new BpmnParser();
        Document document = parser.parse(xmlString);

        String outputFilepath = new ExtensionChanger().changeExtension(args[0], ".xml");
        new ConfigFileWriter().writeFile(outputFilepath, document.toString());
        System.out.println("File output: " + outputFilepath);
    }
}
