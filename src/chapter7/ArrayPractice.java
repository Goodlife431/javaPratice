package chapter7;

public class ArrayPractice {
    public static void main(String[] args) {
        int [] list = new int[30];
//        char[] name = new char[20];
//        double [] num = new double[10];
//        int [][] table = new int[5][10];

//        int [] list = {2,4,6,8};
//        int [] charLetters = {'a','e','i','o','u'};
//        double [] numbers = {3.45, 2.39, 9.1};
//        int [][] table = {{2,5},{3,1},{4,9}};
        int total = 0;
        for (int i = 0; i < 10; i++){
            list[i] = i * 2;
            total =+ i;
        }
        System.out.println(total);
    }
}
