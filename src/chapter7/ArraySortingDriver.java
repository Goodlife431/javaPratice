package chapter7;

public class ArraySortingDriver {
    public static void main(String[] args) {
        int[] arr = new int[7];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 80;
        arr[3] = 70;
        arr[4] = 50;
        arr[5] = 30;
        arr[6] = 40;

        int[] result = ArraySorting.ascendingSorting(arr);
        for (int index : arr) {
            System.out.println(index);
        }
        System.out.println();
        int[] result2 = ArraySorting.descendingSorting(arr);
        for (int index : arr) {
            System.out.println(index);

        }

    }
    }

