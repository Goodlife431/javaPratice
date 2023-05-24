package chapter7;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMaxAndMinTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter number of element you want to store : ");
        n = input.nextInt();
        int [] arr = new int[20];
        System.out.println("Enter elements: ");
        for(int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
        }
        System.out.printf("maximum number is: %d",ArrayMaxAndMin.largestNumber(arr));
    }

}