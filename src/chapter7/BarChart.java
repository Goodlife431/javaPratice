package chapter7;

import java.security.SecureRandom;

public class BarChart {
    public static void main(String[] args) {
//        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        System.out.println("Enter grade distribution: ");
//        for (int i = 0; i < array.length; i++) {
//            if (i == 10) {
//                System.out.printf("%5d", 100);
//            }
//            else {
//                System.out.printf("%02d - %02d", i * 10, i * 10 + 9);
//            }
//            for (int stars = 0; stars < array[i]; stars++) {
//                System.out.print("*");
//        }
//        System.out.println();
//        }
        SecureRandom random = new SecureRandom();
        int [] arr = new int [7];
        for (int i = 0; i <= 500; i++) {
            ++arr[1 + random.nextInt(6)];
        }
        System.out.printf("%3s%10s", "face", "arr");
        for (int face = 0; face < arr.length; face++) {
            System.out.printf("%3d%10d%n", face, arr[face]);
        }
    }
}
