package chapter7;

public class  SumOfArray {
    public static int array(int... numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int maximum(int[] max) {
        int temp = max[0];
        for (int i = 0; i < max.length; i++) {
            if (max[i] > temp) {
                temp = max[i];
            }
        }
        return temp;
    }

    public static int minimum(int[] min) {
        int temp = min[0];
        for (int i = 0; i < min.length; i++) {
            if (min[i] < temp) {
                temp = min[i];
            }
        }
        return temp;
    }
    public static int sumMinimum(int[] arr) {
        int sum = 0;
        int oldArray = arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        return sum;
    }
}

