package org.exampl3.JavaSyntaxZer0.Lesson6_5;

import java.util.Scanner;
import java.nio.file.Path;

public class SixSolutionTwoFive {
    public static void main(String[] main){
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        Path path1 = Path.of(str1);
        Path path2 = Path.of(str2);
        try{
            Path result = path1.relativize(path2);
        }catch(Exception ignored){}
    }
}
