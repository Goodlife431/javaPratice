package chapter4;

public class MysteryProblem {
    public static void main(String[] args) {
//        int count = 1;
//        while ( count <= 20){
//            System.out.println(count % 3 == 1 ? "######" : "*******");
//            count++;
//        }
        int row = 5;

        while(row >= 1){
            int column = 5;

            while (column >= 1) {
                System.out.println(row % 2 == 0 ? "X" : "0");
                ++column;
            }
            --row;
            System.out.println();
        }
    }
}
