package chapter4;
/* (Palindromes) A palindrome is a sequence of characters that reads the same backward as forward. For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
and 11611. Write an application that reads in a five-digit integer and determines whether it’s a palindrome. If the number is not five digits long, display an error message and allow the user to enter
a new value.*/
public class Palindrome {

    public static void palindromeNumber(int number){
        int temp = number;
        int summation = 0;

        while (number != 0) {
            int rem = number % 10;
            summation = (summation * 10) + rem;
            number /= 10;
        }
               if (summation == temp){
                   System.out.println("it is a palindrome number");
               }
               else {
                   System.out.println("it is not a palindrome number");
        }
    }
}
