package chapter5;

import java.util.Scanner;

public class SumOfNaturalNumbers {

        public static void main(String[] args) {
            // even numbers
            Scanner scan =new Scanner(System.in);
            System.out.println("Input the number: ");

            int input = scan.nextInt();
            int sum = 0;

            for(int i = 1; i <= input; i+=1){
                System.out.println(i);
                sum+=i;
            }
            System.out.println("The Sum of even Natural Number upto "+input+" terms is: "+sum);

        }
    }

