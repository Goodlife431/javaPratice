package chapter6;

import java.util.Scanner;

import static chapter6.Nokia.getName;

class ParkingChargersTest {
    public static void main(String[] args) {
        ParkingChargers pc = new ParkingChargers();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter customer name:");
        String name = input.nextLine();
        pc.setName(name);

        System.out.println("Enter hours parked: ");
        int hours = input.nextInt();
        pc.getTotalCharges();

        System.out.printf("name of customer is: %s",getName());
        System.out.println("total charges: %.2f");

    }

}