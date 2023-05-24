package chapter4;

import java.util.Scanner;

public class TaxCalculatorTest {
    public static void main(String[] args) {
        TaxCalculator tax = new TaxCalculator();
        Scanner sc = new Scanner(System.in);
        int taxCollector = 0;

        //do this for three citizens
        while(taxCollector < 3) {
            //Enter the citizens name
            System.out.print("Enter citizen name: ");
            String name = sc.next();
            tax.setName(name);
            //Enter the citizens earnings and calculate tax
            System.out.print("Enter citizens wage: ");
            double wage = sc.nextDouble();
            tax.setTax(wage);
            //return the name and tax of citizen
            System.out.printf("%s earned: $%.2f thereby pays a tax of: $%.3f", tax.getName(), tax.getWage(), tax.getTax());
            ++taxCollector;
            System.out.println();
        }
    }
}
