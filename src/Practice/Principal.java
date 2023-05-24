package Practice;
/*A person invests $1,000 in a savings account yielding 5% interest. Assuming that all
the interest is left on deposit, calculate and print the amount of money in the account
at the end of each year for 10 years. Use the following formula to determine the
amounts:
a = p (1 + r)n
where
p is the original amount invested (i.e., the principal)
r is the annual interest rate (e.g., use 0.05 for 5%)
n is the number of years
a is the amount on deposit at the end of the nth year. */
public class Principal {
    public static void main(String[] args) {
        int principal = 1000;
        double rate = 0.05;

        System.out.printf("%s%s%s%n","Years","\t\t","Amount On deposit");
        for(int years = 1; years <= 10; years++){
            double amount = principal * Math.pow(1.0 + rate,years);
            System.out.printf("%d\t\t\t%.2f%n",years,amount);
        }

    }
}

