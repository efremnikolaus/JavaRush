package org.exampl3.JavaSyntaxZer0.Lesson6_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SixSolutionOneFour {
    public static void main(String[] args) throws IOException {
        byte[] bytes = args[0].getBytes();
        Scanner console = new Scanner(System.in);
        Files.write(Path.of(console.nextLine()), bytes);
    }
}
