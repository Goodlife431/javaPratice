package chapter7;


class SumOfArrayTest {
    public static void main(String[] args) {
        int [] numbers = {20,12,15,16,30};
       int sum =  SumOfArray.array(numbers);
       int max = SumOfArray.maximum(numbers);
       int min = SumOfArray.minimum(numbers);
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
    }
}