package org.exampl3.JavaSyntaxZer0.Lesson6_4;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SixSolutionFourFour {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (PrintStream stream = new PrintStream(baos)) {
            stream.println("Hello");
            stream.println(123);
        }

        String result = baos.toString();
        System.out.println(result);
    }
}
