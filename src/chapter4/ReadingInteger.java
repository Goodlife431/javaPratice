package chapter4;
/* (Reading numbers until a specified sum) Write an application that asks for a number from
the user and then keeps reading integer values from the user until the sum of those integers equals
or becomes greater than the value that was input in the beginning.*/

import java.util.Scanner;

public class ReadingInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("sum of two numbers:"+sum);

        while (true){
            System.out.println("Enter Integers");
            int numbers = input.nextInt();
            if (numbers == sum){
                System.out.println("Number is == sum");
                break;
            }
            if (numbers > sum){
                System.out.println("Number is greater than sum");
                break;
            }
            else {
                System.out.println("oop something is wrong");
                count++;
            }
        }

    }
}
