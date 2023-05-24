package chapter2;

import java.util.Scanner;

/*(Divisible by 3) Write an application that reads an integer and determines and prints
whether it’s divisible by 3 or not. [Hint: Use the remainder operator. A number is divisible by 3 if
it’s divided by 3 with a remainder of 0.] */
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number that can be divided by three: ");
        int num = input.nextInt();

        if (num % 3 == 0) {
            System.out.println("number can be divided by 3");

        }
        else
            System.out.println("number can not be divided by 3");
    }
}