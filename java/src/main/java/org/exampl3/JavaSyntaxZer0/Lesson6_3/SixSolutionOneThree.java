package org.exampl3.JavaSyntaxZer0.Lesson6_3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class SixSolutionOneThree {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = Files.readAllLines(Path.of(scanner.nextLine()));

        for (int i = 0; i < lines.size(); i += 2) {
            System.out.println(lines.get(i));
        }
    }
}
