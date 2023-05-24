package chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
public class Example2 {
        public static void main(String[] args) {
            try(BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(System.in))) {
                System.out.println("Enter string: ");
                String input = bufferedReader.readLine();
                for (int count = 0; count < input.length() ; count++) {
                    if (input.charAt(count) == '_') {
                        System.out.print(input.charAt(count+1));
                    }
                }
            } catch (IOException exception) {
                System.out.println(exception.getMessage());

            }
    }
}
