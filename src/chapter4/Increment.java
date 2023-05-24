package chapter4;

public class Increment {
    public static void main(String[] args) {
        int c = 5;
        while (true) {
            System.out.printf("c before postincrement: %d%n", c);
            System.out.printf("post-incrementing c: %d%n", c++);
            System.out.printf("c after postincrement: %d%n", c);

            System.out.println();

            c = 5;
            System.out.printf("c before preincrement: %d%n", c);
            System.out.printf("pre-incrementing c: %d%n", ++c);
            System.out.printf("c after preincrement: %d%n", c);
        }
    }
}
