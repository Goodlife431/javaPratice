package chapter7;

public class ArrayMaxAndMin {
    public static int largestNumber(int [] largest){
        int temp = largest[0];
        for (int j : largest) {
            if (j > temp) {
                temp = j;
            }
        }
        return temp;
    }
    public static int smallestNumber(int[] smallest){
        int temp = smallest[0];
        for(int j : smallest){
            if(smallest[j] < temp){
                temp = smallest[j];
            }
        }
        return temp;
    }


}
