package Practice;

public class Method {
    public static int[] reversedArray(int [] arr){
        int [] result = new int[arr.length];
        int j = 0;
       for (int i = arr.length - 1; i >= 0; i--){
            result[j] = arr[i];
           j++;
       }
       return result;
    }
}
