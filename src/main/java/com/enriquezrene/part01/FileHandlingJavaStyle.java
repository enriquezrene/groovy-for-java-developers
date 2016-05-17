package com.enriquezrene.part01;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by moe on 5/16/16.
 */
public class FileHandlingJavaStyle {

    public static void main(String[] args) throws Exception {
        String fileName = "src/main/resources/com/enriquezrene/part01/file-demo.txt";
        int number = 0;
        List<String> lines = Files.readAllLines(Paths.get(fileName));
        for (String line: lines) {
            number ++;
            System.out.println(number+": " +line);
        }

    }
}
