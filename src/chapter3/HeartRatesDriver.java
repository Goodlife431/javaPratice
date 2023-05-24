package chapter3;

import java.util.Scanner;

public class HeartRatesDriver {
    public static void main(String[] args) {

        HeartRates heartRates = new HeartRates("okafor", "henry", 10, 12, 20, 1980);

        System.out.printf("user firstname: %s ",heartRates.firstName);
        System.out.println();
        System.out.printf("user lastname: %s ",heartRates.lastName);
        System.out.println();
        System.out.printf("user date of birth: %d%d%d", heartRates.date,heartRates.month,heartRates.year);
        System.out.println();
        System.out.println("enter age in years: "+heartRates.year);


        System.out.printf("user age is: %d", heartRates.age);




    }

}

