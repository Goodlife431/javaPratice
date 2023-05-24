package chapter3;
import java.util.Scanner;
public class AccountDriver {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);


        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());


        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());



        System.out.print("Enter amount to withdraw from account1: ");
        double withdrawAmount = input.nextDouble();
        System.out.printf("%nwithdrawing %.2f from account1%n%n", withdrawAmount);
        account1.withdraw(withdrawAmount);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());

    }
}
