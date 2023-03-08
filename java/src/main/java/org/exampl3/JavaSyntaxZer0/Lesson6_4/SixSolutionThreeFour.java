package org.exampl3.JavaSyntaxZer0.Lesson6_4;

import java.io.InputStream;
import java.util.Scanner;

public class SixSolutionThreeFour {
    public static void main(String[] args) {
        Thread someThread = new Thread();
        someThread.run();


    }
    class SomeThread implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Number - " + i);
            }
        }
    }
}
