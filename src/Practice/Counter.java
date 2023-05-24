package Practice;

public class Counter {
    public static void main(String[] args) {
        int total = 0;
        for (int number = 2; number <= 20; number += 2) {
            total = total + number;
            System.out.println(total);
        }

    }
}
