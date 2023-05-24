package chapter2;

import java.util.Scanner;

/*(Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
representation of the average. So, if the sum of the values is 7, the average should be 2, not
2.3333….]*/
public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Integer: ");
        int x = input.nextInt();

        System.out.println("Enter second Integer: ");
        int y = input.nextInt();

        System.out.println("Enter third Integer: ");
        int z = input.nextInt();

        int total = (x + y + z);
        int product = (x*y*z);
        int average = (total/3);
        int largest = Math.max(Math.max(x,y),z);
        int smallest = Math.min(Math.min(x,y),z);

        System.out.println("The sum is: "+total);
        System.out.println("The average is: "+average);
        System.out.println("the product is: "+product);
        System.out.println("the largest is: "+largest);
        System.out.println("the smallest is: "+smallest);
    }

    public int testForSumOfThreeNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int productOfThreeNumbers(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public int averageOfThreeNumbers(int num1, int num2, int num3) {
        return (num1 + num2 + num3) /3;
    }

    public int testForLargestOfThreeNumbers(int num1, int num2, int num3) {
        int largest = num1;
        if (num2 > largest){
            largest = num2;
            if (num3 > largest){
                largest = num3;
            }
        }
        return largest;
    }

    public int testForSmallestOfThreeNumbers(int num1, int num2, int num3) {
        int smallest = num1;
        if (num2 < smallest){
            smallest = num2;
            if (num3 < smallest){
                smallest = num3;
            }
        }
        return smallest;
    }
}
