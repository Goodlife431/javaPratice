package chapter4;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a number: ");
        int number = input.nextInt();

        if(number %5 == 0 && number %3 == 0) {
            System.out.println("fizzbuss");
        }
        else if(number %5 == 0) {
            System.out.println("fizz");
        }
             else if(number %3 == 0) {
                  System.out.println("buzz");
              }

            else {
            System.out.println("number");
              }
        }
    }



