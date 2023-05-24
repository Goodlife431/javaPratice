import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of a circle: ");
        int radius = input.nextInt();

        double diameter = 2*radius;
        double circumference = Math.PI*2*radius;
        double area = Math.PI*radius*radius;

        System.out.printf("diameter is: %.2f",diameter);
        System.out.println();
        System.out.printf("circumference is: %.2f", circumference);
        System.out.println();
        System.out.printf("area is: %.2f", area);
    }
}
