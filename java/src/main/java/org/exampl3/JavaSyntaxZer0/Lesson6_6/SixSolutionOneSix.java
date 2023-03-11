package org.exampl3.JavaSyntaxZer0.Lesson6_6;


import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;

public class SixSolutionOneSix {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());
        if(Files.notExists(filePath)){
            Files.createFile(fileNewPath);
        } else if(Files.exists(filePath)){
            Files.move(filePath, fileNewPath);
        } else{
            Files.delete(filePath);
        }
    }
}
