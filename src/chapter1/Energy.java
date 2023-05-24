package chapter1;

import java.util.Scanner;

public class Energy {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of kilograms: ");
        double M = input.nextDouble();

        System.out.println("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();

        System.out.println("Enter the finial temperature: ");
        double finalTemperature = input.nextDouble();

        double Q = M * (finalTemperature - initialTemperature) * 4184;

        System.out.printf("The energy needed is: %.2f%n", Q);


    }




}


