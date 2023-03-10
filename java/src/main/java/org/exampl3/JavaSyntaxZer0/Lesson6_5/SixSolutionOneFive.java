package org.exampl3.JavaSyntaxZer0.Lesson6_5;

import java.util.Scanner;
import java.nio.file.Path;


public class SixSolutionOneFive {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Path diskName = Path.of(line).getRoot();
    }
}
