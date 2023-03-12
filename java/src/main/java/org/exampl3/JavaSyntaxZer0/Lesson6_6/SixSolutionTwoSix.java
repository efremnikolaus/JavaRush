package org.exampl3.JavaSyntaxZer0.Lesson6_6;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.util.Scanner;
import java.nio.file.Path;

public class SixSolutionTwoSix {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path directory = Path.of(scanner.nextLine());
        try (DirectoryStream<Path> paths = Files.newDirectoryStream(directory)) {
            for (Path path : paths) {
                if (Files.isRegularFile(path)) {
                    System.out.println(path.toString() + THIS_IS_FILE);
                } else if (Files.isDirectory(path)) {
                    System.out.println(path.toString() + THIS_IS_DIR);
                }
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
