package chapter6;

import java.util.Scanner;

/*(Multiples) Write a method isMultiple that determines, for a pair of integers, whether the
second integer is a multiple of the first. The method should take two integer arguments and return
true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder operator.]
Incorporate this method into an application that inputs a series of pairs of integers (one pair at a
time) and determines whether the second value in each pair is a multiple of the first. */
public class Multiples {
    public static int number1 = 0;
    public static int number2 = 0;

    public static void checkMultiple() {
        if ((number2 % number1) == 0) {
            System.out.println("it is a multiple of the  number");
        } else
            System.out.println("it is not multiple of the number");
    }
}




