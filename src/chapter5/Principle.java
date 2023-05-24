package chapter5;

public class Principle {
    public static void main(String[] args) {
        double principle = 1000.0;
        double rate = 0.05;

        System.out.printf("%s%20s%n", "Years", "Amount on deposit");

        for (int year = 1; year <= 10; ++year){
            double amount = principle * Math.pow(1.0 + rate, year);

            System.out.printf("%-4d%,20.2f%n",year, amount);
        }
    }
}
