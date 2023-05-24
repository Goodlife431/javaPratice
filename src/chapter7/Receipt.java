package chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String customerName;
        ArrayList<String> itemsBrought = new ArrayList<>();
        ArrayList<Integer> quantity = new ArrayList<>();
        ArrayList<Integer> amount = new ArrayList<>();
        String moreItems = "yes";

        System.out.println("Enter customer name: ");
        itemsBrought.add(input.next());
        while (moreItems.equals("yes")) {
            System.out.println("Enter quantity of items: ");
            quantity.add(input.nextInt());
            System.out.println("Enter the price you brought them: ");
            amount.add(input.nextInt());
            System.out.println("Do you want to buy more items?: ");
            moreItems = input.next();
            int total = 0;
            for (int count = 0; count < itemsBrought.toArray().length; count++) {
                total += quantity.get(count) * amount.get(count);
            }
            System.out.println(total);
        }

    }
}








