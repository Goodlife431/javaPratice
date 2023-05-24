package chapter7;

public class ArraySorting {
    static int temp;
    public static int[] descendingSorting(int[] numbers) {
        int[] descendingNumber = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > numbers[i]) {
                    temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        return descendingNumber;
    }

    public static int[] ascendingSorting(int[] numbers1) {
        int [] ascendingNumber = new int[numbers1.length];
        for (int i = 0; i < numbers1.length; i++) {
            for (int j = i + 1; j < numbers1.length; j++) {
                if (numbers1[j] < numbers1[i]) {
                    temp = numbers1[j];
                    numbers1[j] = numbers1[i];
                    numbers1[i] = temp;
                }
            }
        }
        return ascendingNumber;
    }
}




