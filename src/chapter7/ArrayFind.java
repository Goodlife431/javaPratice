package chapter7;

import java.util.Arrays;

public class ArrayFind {
    public static int [] swap(int [] array){
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int [] arr = {2,6};
        System.out.println(Arrays.toString(swap(arr)));

    }

}
