package org.exampl3.JavaSyntaxZer0.Lesson6_6;


import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;

public class SixSolutionOneSix {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            String str = scanner.nextLine();
            if(str.isEmpty()){
                break;
            }
            if(Files.isRegularFile(Path.of(str))){
                System.out.println(str + THIS_IS_FILE);
            }else if(Files.isDirectory(Path.of(str))){
                System.out.println(str + THIS_IS_DIR);
            } else {
                break;
            }
        }
    }
}
