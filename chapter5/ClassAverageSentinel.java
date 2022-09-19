package chapter5;

import java.util.Scanner;

public class ClassAverageSentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 0;
        double average = 0;
        int grade = 0;

        System.out.println("Enter first grade(or -1 to exit):");
        grade = input.nextInt();

        while (grade != -1) {
            total = total + grade;
        gradeCounter = gradeCounter + 1;

        System.out.println("Enter next grade(or -1 to exit):");
        grade = input.nextInt();
    }

        if(gradeCounter != 0) {
            average = total / gradeCounter;
            System.out.printf("the total of the %d grades entered is: %d", gradeCounter, total);
            System.out.println();
            System.out.printf("the class average is: %.2f", average);
        }

            else {
                System.out.println("No grades were entered");
            }
        }





    }

