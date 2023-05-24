package chapter4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int largest = 0;
        int number = 0;

        while (count <= 10){
            System.out.println("Enter ten integers: ");
            number = input.nextInt();
            if(number > largest){
                largest = number;
            }
            count++;
        }
        System.out.println("largest number is: "+largest);
        System.out.println("Most recent number: "+number);
    }
}