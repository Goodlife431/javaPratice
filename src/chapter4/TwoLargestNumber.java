package chapter4;

import java.util.Scanner;

public class TwoLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int firstLargest = 0;
        int secondLargest = 0;
        int number;

        while (count <= 10){
            System.out.println("Enter ten Integers: ");
            number = input.nextInt();
            if (number > firstLargest ){
                secondLargest = firstLargest;
                firstLargest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
            count++;
        }
        System.out.println("The largest number is: "+firstLargest);
        System.out.println("The second largest number is: "+secondLargest);
    }
}
