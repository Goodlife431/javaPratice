package chapter7;
public class Array {
    public static void main(String[] args) {
        int [] numbers;
        numbers = new int[7];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        numbers[5] = 60;
        numbers[6] = 70;

        for(int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }

    }
}
