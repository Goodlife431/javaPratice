package chapter4;

import java.util.Arrays;
import java.util.Scanner;

 public class GuessingApp {
     public static void main(String[] args) {
        int number = 35;
         Scanner input = new Scanner(System.in);
         System.out.println("Enter your guessing number");
         int guess = input.nextInt();

         if(guess > number) {
             System.out.println("number is too high");
         } else if (guess < number) {
             System.out.println("number too low");
         } else
             System.out.println("perfect number");



             }
         }



