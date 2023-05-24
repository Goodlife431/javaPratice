package chapter9;

import java.util.Scanner;

public class ClassCode1 {
    private  static Scanner scanner = new Scanner(System.in);
    private  static  int[] numbers = {23,56,18,90,100};
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int userInput = scanner.nextInt();
       try {
           VerifyNumber(userInput);
       }catch (Exception e){
           e.printStackTrace();
       }finally {
           for (int i = 0; i < 10; i++){
               System.out.println(".");
           }
       }
    }
    private static void VerifyNumber(int userInput) throws NumberNotFoundException{
        for (int number:numbers){
            if(number == userInput){
                System.out.println("found");
                System.exit(0);
            }
        }
        throw new NumberNotFoundException("number you enter does not exist");
    }
}
