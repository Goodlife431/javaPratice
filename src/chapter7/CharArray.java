package chapter7;

public class CharArray {
    public static void main(String[] args) {
//        char[][] chars = {{'x', 'o', 'x'}, {'x', 'o', 'x'}, {'x', 'o', 'x'}};
//
//        for (char[] c : chars) {
//            for (char value : c) {
//                System.out.print(value +"  ");
//            }
//            System.out.println();
//        }

        char [] firstRow = {'X', 'O', 'X'};
        char [] secondRow = {'X', 'O', 'X'};
        char [] thirdRow = {'X', 'O', 'X'};

        char[][] ticTacToe = new char[3][];
        ticTacToe[0] = firstRow;
        ticTacToe[1] = secondRow;
        ticTacToe[2] = thirdRow;

        for (int row = 0; row < ticTacToe.length; row++){
            for (int col = 0; col < ticTacToe[row].length; col++){
                System.out.print(ticTacToe[row][col] +" ");
            }
            System.out.println();
        }
    }
}


