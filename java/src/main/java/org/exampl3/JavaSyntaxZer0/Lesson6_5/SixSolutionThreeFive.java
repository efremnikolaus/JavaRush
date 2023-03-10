package org.exampl3.JavaSyntaxZer0.Lesson6_5;

import java.util.Scanner;
import java.nio.file.Path;

public class SixSolutionThreeFive {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        if(Path.of(path).isAbsolute()){
            System.out.println(path);
        }
        else{
            System.out.println(Path.of(path).toAbsolutePath());
        }
    }
}
