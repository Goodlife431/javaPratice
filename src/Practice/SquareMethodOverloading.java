package Practice;

public class SquareMethodOverloading {
    public static int square(int number){
        return number * number;
    }
    public static double square(double number){
        return number * number;
    }

    public static void main(String[] args) {
        System.out.printf("square of number in int is: %d",square(7));
        System.out.println();
        System.out.printf("square of number in double is: %.2f",square(7.5));
    }
}
