package Practice;
/*Twenty students were asked to rate on a scale of 1 to 5 the quality of the food in the
student cafeteria, with 1 being “awful” and 5 being “excellent.” Place the 20 responses
in an integer array and determine the frequency of each rating.*/

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

public class StudentPolll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] responses = {1,7,30,8,2,10,13,12,9,4,5,14,23,43,34,21,35,8,67,100};
        int [] frequency = new int[6];

        for (int answer = 0; answer < responses.length; answer++){
            try{
                ++frequency[responses[answer]];
            }
            catch (ArrayIndexOutOfBoundsException e ){
                System.out.println(e);
                System.out.printf("responses [%d] = %d%n%n", answer, responses[answer]);
            }
        }
        System.out.printf("%s%10s%n", "Rating", "Frequency");

        for (int rating = 1; rating < frequency.length; rating++){
            System.out.printf("%6d%10d%n", rating, frequency[rating]);
        }
    }
}

//        double[] myList = new double[7];
//        myList[0] = 45.5;
//        myList[1] = 32.5;
//        myList[2] = 65.1;
//        myList[3] = 54.1;
//        myList[4] = 76.4;
//        myList[5] = 43.1;
//        myList[6] = 53.1;
//
////        int i;
////        for (i = 0; i < myList.length; i++) {
//            myList[i] = i;
//            System.out.println(i);
//        }

//        System.out.print("Enter " + myList.length + "Values: ");
//        for (int i = 0; i < myList.length; i++) {
//            myList[i] = input.nextDouble();
//        }
//        System.out.println();
//        for (double v : myList) {
//            System.out.println(v + " ");
//        }
//        double min =  myList[0];
//        double indexMax = 0;
//        for (double i = 0; i < myList.length; i++){
//            if(myList[(int) i] > min){
//                min = myList[(int) i];
//                indexMax = i;
//                System.out.println(indexMax);
//            }
//        }
// RANDOM SHUFFLING
//        double temp = 0;
//        for (int i = myList.length - 1; i > 0; i--) {
//            int j = (int) (Math.random() * (i +1 ));
//            temp = myList[i];
//            myList[i] = myList[j];
//            myList[j] = temp;
//            System.out.println(temp);
//        }
//    double temp = myList[0];
//    for(int i = 1; i < myList.length; i++){
//        myList[i - 1] = myList[i];
//    }
//    myList[myList.length -1] = temp;
//        System.out.println();
//        int x = 30;
//        int [] numbers = new int[x];
//        x = 60;
//        System.out.println("x is " + x);
////        System.out.println("the size of array is :" + numbers.length);
//        double [] numbers = new double[10];
//        numbers[0] = 1.1;
//        numbers[1] = 1.2;
//        numbers[2] = 13.1;
//        numbers[3] = 1.15;
//        numbers[4] = 4.5;
//        numbers[5] = 20.5;
//        numbers[6] = 4.7;
//        numbers[7] = 21.8;
//        numbers[8] = 14.7;
//        numbers[9] = 5.5;

//        double total = (numbers[0] + numbers[1]);
//        System.out.println(total);
//        double total = 0;
//        for(int i = 0; i < numbers.length; i++){
//           total += numbers[i];
//        }
//        System.out.println(total);

//        double min = numbers[0];
//        for(int i = 1; i < numbers.length; i++){
//            if (numbers[i] < min){
//                min = numbers[i];
//            }
//        }
//        System.out.println(min);
//        double[] r = new double[20];
//        for (int i = 1; i < r.length; i++) {
//            r[i] = (int ) (random() * 100);
//        }
//        System.out.println(Arrays.toString(r));
//        int [] list = {2,3,4,5,6};
//        for (int i = 1; i < list.length; i++) {
//            list[i] = list[i - 1];
//        }
//         for (int i = 0; i < list.length; i++) {
//             System.out.print(list[i] + " ");


