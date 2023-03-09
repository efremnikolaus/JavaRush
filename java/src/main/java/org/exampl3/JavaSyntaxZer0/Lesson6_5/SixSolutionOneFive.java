package org.exampl3.JavaSyntaxZer0.Lesson6_5;

import java.io.File;

public class SixSolutionOneFive {
    public static void main(String[] args) {
        File file = new File("C:\\file.txt");
        if(!file.exists()){
            file.mkdir();
        }
    }
}
