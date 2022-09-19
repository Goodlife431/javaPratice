package chapter2;
import java.util.Scanner;
public class ConvertToMetres {


        public static void main(String[] args){
            Scanner guide= new Scanner(System.in);
            System.out.println("Enter a value for feet:  ");
            double feet = guide.nextDouble();
            double meters = feet * 0.305;
            System.out.println(feet + " feet is " + meters + " meters");
        }


    }

