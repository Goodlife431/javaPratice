package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNumbers {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] numbers = new int[5];
//        for (int i = numbers.length - 1; i > 0; i--) {
//            System.out.println("Enter a number: ");
//            numbers[i] = input.nextInt();
//        }
//        for(int index = 1; index < numbers.length; index++){
//            System.out.printf("%d   ",numbers[index]);
//        }

    }
//    public static int[] reverseTheArray(int[] arr) {
//
//    }

    public static String reverseString(String letters) {
        String reversed = "";
        for (int counter = letters.length() - 1; counter >= 0; counter--) {
            reversed = reversed + "" + letters.charAt(counter);
        }
        return reversed;
    }
}

