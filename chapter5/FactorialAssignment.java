package chapter5;

import java.util.Scanner;

public class FactorialAssignment {
    public static void main(String[] args) {
        int num;
        int i;
        int fact = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("enter the your factorial number");
        num = input.nextInt();

        for(i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("/factorial result = " +fact);
        }


    }

