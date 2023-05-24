package chapter7;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int [] arr = {3,6,9,10,56,30};
        int i = arr.length, j, temp ;
        while (i-- > 0) {
            j = 1 + random.nextInt(5);
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        System.out.print(Arrays.toString(arr));

    }
}
