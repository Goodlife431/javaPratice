package chapter5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class iteration {
    public static void main(String[] args) {
        int count = 0;
        ArrayList<Integer> numbers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while (count != -1) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            if (number > 0 && number < 100) {
                numbers.add(number);
                count++;
            }
        }
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println(max + "   " + min);
    }
}
