package chapter15;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Example {
    public static void main(String[] args) {
        try (PrintStream printStream = new PrintStream("C:\\Users\\Oduwole Oluwaseun\\IdeaProjects\\Oduwole\\src\\chapter15\\output.txt")){
            printStream.println("Semicolon Africa");
        }
        catch (FileNotFoundException e ){
            System.out.println(e.getMessage());
        }
    }
}
