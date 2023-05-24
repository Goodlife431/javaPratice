package Practice;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MethodTest {
    public static void main(String[] args) {


        int[] list = {3, 6, 9, 1, 0};
        int [] okay = Method.reversedArray(list);

        for(int i = 0; i < okay.length; i++ ){
            System.out.println(okay[i]);
        }
    }
}