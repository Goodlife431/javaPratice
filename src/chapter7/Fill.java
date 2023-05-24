package chapter7;

public class Fill {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int index = 0; index < array.length; index++) {
            System.out.printf("%d,", array[index]);

        }
    }
}
