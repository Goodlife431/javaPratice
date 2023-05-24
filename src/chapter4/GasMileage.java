package chapter4;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int miles = 0;
        int gallons = 0;
        double mpg = 0.0;
        int totalMiles = 0;
        int totalGallons = 0;
        double totalMpg = 0.0;
        int counter = 0;

        System.out.println("Enter miles driven :");
        miles = input.nextInt();
        if (miles != -1) {
            System.out.println("Enter gallons used for each trip");
            gallons = input.nextInt();
            counter++;
        }

        while (miles != -1) {
            totalMiles = totalMiles + miles;
            totalGallons = totalGallons + gallons;
            totalMpg = (double) totalMiles / totalGallons;
            System.out.printf("Total average is (Or - 1 to exit): %.2f ", totalMpg);
            totalMpg = input.nextInt();


        }



    }
}