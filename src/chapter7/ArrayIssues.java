package chapter7;

public class ArrayIssues {
    public static void main(String[] args) {
//        int[] firstRow = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] secondRow = {2, 3, 4, 5, 6, 7, 8, 9, 1};
//        int[] thirdRow = {3, 4, 5, 6, 7, 8, 9, 1, 2};
//        int[] fourthRow = {4, 5, 6, 7, 8, 9, 1, 2, 3};
//        int[] fifthRow = {5, 6, 7, 8, 9, 1, 2, 3, 4};
//        int[] sixthRow = {6, 7, 8, 9, 1, 2, 3, 4, 5};
//        int[] seventhRow = {7, 8, 9, 1, 2, 3, 4, 5, 6};
//        int[] eightRow = {8, 9, 1, 2, 3, 4, 5, 6, 7};
//        int[] ninthRow = {9, 1, 2, 3, 4, 5, 6, 7, 8,};
//
//        int[][] table = new int[9][9];
//        table[0] = firstRow;
//        table[1] = secondRow;
//        table[2] = thirdRow;
//        table[3] = fourthRow;
//        table[4] = fifthRow;
//        table[5] = sixthRow;
//        table[6] = seventhRow;
//        table[7] = eightRow;
//        table[8] = ninthRow;
//
//        for (int row = 0; row < table.length; row++) {
//            for (int col = 0; col < table[row].length; col++) {
//                System.out.print(table[row][col] + "  ");
//            }
//            System.out.println();
//
//        }
       for(int column = 1; column <= 9; column++){
           for(int row = 0; row <= 8; row++){
               if((column + row) > 9){
                   System.out.printf("%d ",(column + row)% 9);
               }
               else {
                   System.out.printf("%d ",(column+row));
               }
           }
           System.out.println();
       }

    }
}