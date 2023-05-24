package chapter8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class FileException {
    public static void main(String[] args) throws IOException {
      try (Reader reader = new FileReader("C:\\Users\\Oduwole Oluwaseun\\IdeaProjects\\Oduwole\\src\\Files");
           BufferedReader bufferedReader = new BufferedReader(reader);
           Scanner scanner = new Scanner(System.in);
           ){
          System.out.println(bufferedReader.readLine());
//          System.exit(1);
      } catch (IOException e) {
          System.out.println(e.getMessage());
//          System.exit(1);
      }
      finally {
          System.out.println("In finally block");
//          if(reader != null){
//              System.out.println("closing reader");
//              reader.close();
//          }
//          if (bufferedReader != null){
//              reader.close();
//          }
      }
    }
}
