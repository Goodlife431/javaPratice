package chapter4;

import java.security.SecureRandom;
import java.util.Scanner;

/* Recall that Listing 3.1, AdditionQuiz.java, gives a program that prompts the user to enter
an answer for a question on addition of two single digits. Using a loop, you can now rewrite
the program to let the user repeatedly enter a new answer until it is correct, as shown in
Listing 5.1*/
public class Practice {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int num1;
        int num2;
         random.nextInt(6);

        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();



    }
    
}
