package chapter7;

public class TwoLargestNumber {
    public static int theTwoLargestNumber(int[] twoLargestNumber) {

//        int maximum = twoLargestNumber[0];
//        int secondMaximum = twoLargestNumber[0];
//        for (int i : twoLargestNumber) {
//            if (i > maximum) {
//                secondMaximum = maximum;
//                maximum = i;
//            }
//        }
//        return maximum + secondMaximum;
        int temp = twoLargestNumber[0];
        twoLargestNumber[0] = twoLargestNumber[1];
        twoLargestNumber[1] = temp;
        return temp ;
    }

}
