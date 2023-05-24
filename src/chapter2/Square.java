package chapter2;

import java.util.Scanner;

/*(Arithmetic) Write an application that asks the user to enter two integers, obtains them from
the user and prints the square of each, the sum of their squares, and the difference of the squares (first
number squared minus the second number squared). */
public class Square {
    public static void main(String[] args) {
       /*Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
       int x = input.nextInt();
       int squareX = x*x;
        System.out.print("Enter second integer: ");
        int y = input.nextInt();
        int squareY = y*y;
        int sum = squareX + squareY;
        int difference = squareX - squareY;

        System.out.println("the square of x is: "+squareX);
        System.out.println("the square of y is: "+squareY);
        System.out.println("the sum of square is: "+sum);
        System.out.println("the difference of square is: "+difference);*/
    }

    public int squareOfNumber(int number1) {
        return number1 * number1;
    }
    public int squareOfNumber2(int number2) {
        return number2 * number2;
    }
    public int additionOfSquare(int number1, int number2) {
        return number1 + number2;

    }
    public int subtractionOfSquare(int number1, int number2){
        return number1 - number2;
    }
}

