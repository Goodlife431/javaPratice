package chapter2;

import java.util.Scanner;

/*(Comparing Integers) Write an application that asks the user to enter one integer, obtains
it from the user and displays whether the number and its square are greater than, equal to, not equal
to, or less than the number 100. Use the techniques shown in Fig. 2.15. */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Integer: ");
        int x = input.nextInt();
        x = x*x ;

        if(x == 100 ) {
            System.out.println("user integer is equal to 100");
        }
        if (x > 100){
            System.out.println("user integer is greater than 100");
        }
        if (x != 100){
            System.out.println("user integer is not equal to 100");
        }
        if (x < 100){
            System.out.println("user integer is less than 100");
        }




    }
}
