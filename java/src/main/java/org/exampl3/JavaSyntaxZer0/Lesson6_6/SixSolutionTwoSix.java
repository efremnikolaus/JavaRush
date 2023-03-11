package org.exampl3.JavaSyntaxZer0.Lesson6_6;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;
import java.nio.file.Files;

public class SixSolutionTwoSix {
    public static void main(String[] args) {
        Path path = Path.of("c:\\windows");
        try(DirectoryStream<Path> files = Files.newDirectoryStream(path)){
            for(Path path2 : files){
                System.out.println(path2);
            }
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
