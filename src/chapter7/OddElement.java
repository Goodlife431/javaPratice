package chapter7;

public class OddElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,7,8,9,10};
        for(int i = 0; i < arr.length; i += 2){
            System.out.println(arr[i]);
        }
    }
}
