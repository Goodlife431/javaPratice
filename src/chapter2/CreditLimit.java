package chapter2;

import java.io.PrintStream;
import java.util.Scanner;

/*(Credit Limit Calculator) Develop a Java application that determines whether any of sev￾eral department-store customers has exceeded the credit limit on a charge account. For each cus￾tomer, the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.*/
public class CreditLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int accountNumber =0;
        double beginningBalance = 0;
        double totalItem = 0;
        double totalCredit = 0;
        double allowedCredit = 0;
        double newBalance = 0;

        System.out.println("Enter account number: ");
        accountNumber = input.nextInt();

        System.out.println("Enter beginning balance: ");
        beginningBalance = input.nextDouble();

        System.out.println("Enter total items charged by the customer this month: ");
        totalItem = input.nextDouble();

        System.out.println("Enter total of all credits applied to the customer's account this month");
        totalCredit = input.nextDouble();

        allowedCredit = newBalance;
        newBalance = beginningBalance - totalItem + totalCredit;

        System.out.println("allowed credit limit is: "+ newBalance);
        if (newBalance > totalCredit) {
            System.out.println("Credit limit exceeds");

        }
    }

}

/*   private int scv;
    private static int counter;

    public TaxCalculator() {
        scv = ++counter;
    }


    public static void main(String[] args) {
TaxCalculator shola = new TaxCalculator();
        System.out.println("increment is: "+shola.scv);

        TaxCalculator adewummi = new TaxCalculator();
        System.out.println("second increment is: "+adewummi.scv);
    }
} */
