package chapter7;

public class Reverse {

//    public static int[] reverse(int[] userArray) {
//        int[] newArray = new int[userArray.length];
//        int forwardCounter = 0;
//        for (int backwardCounter = userArray.length - 1; backwardCounter >= 0; backwardCounter--) {
//            newArray[forwardCounter] = userArray[backwardCounter];
//            forwardCounter++;
//        }
//        return newArray;
//    }

    public String reverse(String input) {
        String reversed = "";
        for(int counter = input.length() - 1; counter >= 0; counter--) {
            reversed = reversed + "" + input.charAt(counter);
        }
        return reversed;
    }

    public String reverse(String input, int bar) {
        String capitalized = "";
        capitalized = capitalized + input.toUpperCase().charAt(0);
        for (int counter = 1; counter < input.length(); counter++) {
            capitalized = capitalized + "" + input.toLowerCase().charAt(counter);
        }
        return capitalized;
    }
}


