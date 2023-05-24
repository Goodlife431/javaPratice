package chapter4;

import java.util.Scanner;

/* (Printing the Decimal Equivalent of a Binary Number) Write an application that inputs
an integer containing only 0s and 1s (i.e., a binary integer) and prints its decimal equivalent. [Hint:
Use the remainder and division operators to pick off the binary number’s digits one at a time, from
right to left. In the decimal number system, the rightmost digit has a positional value of 1 and the
next digit to the left a positional value of 10, then 100, then 1000, and so on. The decimal number
234 can be interpreted as 4 * 1 + 3 * 10 + 2 * 100. In the binary number system, the rightmost digit
has a positional value of 1, the next digit to the left a positional value of 2, then 4, then 8, and so
on. The decimal equivalent of binary 1101 is 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8, or 1 + 0 + 4 + 8 or, 13.]*/
public class BinaryNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long binaryNumber;
        long decimalNumber = 0;
        long j = 1;
        long remainder;

        System.out.println("Enter binary numbers 1 and 0s: ");
        binaryNumber = input.nextLong();
        while (binaryNumber != 0){
            remainder = decimalNumber % 10;
            decimalNumber = decimalNumber + remainder * j;
            j = j *2;
            binaryNumber = binaryNumber / 10;
        }
        System.out.println("Decimal Number: "+ decimalNumber);
    }
}
