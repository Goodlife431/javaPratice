package chapter7;

public class AddArray {
//    public static void main(String[] args) {
//
//        int sum = 0;
//        int [] numbers;
//        numbers = new int[7];
//
//        numbers[0] = 22;
//        numbers[1] = 55;
//        numbers[2] = 34;
//        numbers[3] = 66;
//        numbers[4] = 67;
//        numbers[5] = 82;
//        numbers[6] = 43;
//
//
//        for(int index = 0; index < numbers.length; index++) {
//          sum = sum + numbers[index];
//
//        }
//        System.out.printf("Sum of number in array: %d%n", sum);
//
//    }

    public static void main(String[] args) {
        int [] numbers = {43, 56, 10, 30, 49, 12, 80};
        int sum = 0;

        for(int index = 0; index < numbers.length; index++) {
            sum = sum + numbers[index];
        }
        System.out.println("sum of number in array: "+ sum);
    }
}
