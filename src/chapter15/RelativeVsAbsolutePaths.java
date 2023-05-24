package chapter15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativeVsAbsolutePaths {
        public static void main(String[] args) {
            Path currentDirectory = Paths.get("").toAbsolutePath();
            Path target = Paths.get("C:\\Users\\Admin\\IdeaProjects\\semicolonProjects\\src\\ChapterFifteen\\test.txt");
            Path relative = currentDirectory.relativize(target);
            System.out.println(relative);

            Path path = Paths.get("../formatter/Example.java");
            System.out.println(path.getFileName());
            System.out.println("Is Directory:: "+ Files.isDirectory(path));
            System.out.println("Exists:: "+Files.exists(path));
            try{
                System.out.println("modified:: "+Files.getLastModifiedTime(relative));
            }catch(IOException ioe){
                ioe.printStackTrace();
                System.err.println("error:: "+ioe.getMessage());
        }

    }
}
