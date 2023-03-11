package org.exampl3.JavaSyntaxZer0.Lesson6_6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.List;

public class SixSolutionOneSix {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("c:\\readme.txt");
        List<String> list = Files.readAllLines(path);
        for(String str : list) {
            System.out.println(str);
        }
    }
}
