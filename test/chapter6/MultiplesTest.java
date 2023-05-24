package chapter6;

import java.util.Scanner;

class MultiplesTest {
    public static void main (String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        Multiples.number1 = input.nextInt();

        System.out.println("Check if it is multiply of the number: ");
        Multiples.number2 = input.nextInt();

        Multiples.checkMultiple();
    }
}


