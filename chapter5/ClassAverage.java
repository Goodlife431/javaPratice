package chapter5;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 1;
        int grade = 0;
        int average;

        while(gradeCounter <= 10) {
            System.out.println("Enter your grade: ");
             grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }

        average = total/10;

        System.out.printf("The total grade is: %d", total);
        System.out.println();
        System.out.printf("The class average is: %d", average);

                }


        }

