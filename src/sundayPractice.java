import java.util.Scanner;

public class sundayPractice {

    public static int multiplication(int num1, int num2) {
        return num1 * num2;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter first number: ");
            int number1 = input.nextInt();
            if (number1 == -1){
                break;
            }
            System.out.println("Enter second number: ");
            int number2 = input.nextInt();
            int result = multiplication(number1,number2);

            System.out.println("multiplication answer is: "+result);
        }

    }
}

