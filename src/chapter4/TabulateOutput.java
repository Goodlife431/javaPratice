package chapter4;

public class TabulateOutput {
    public static void main(String[] args) {

        System.out.printf("%4s%4s%4s%4s", "N", "N2", "N3", "n4");

        int count = 0;
        while (count < 6){
            for (int i = 1; i < 5; i ++){
                System.out.print(Math.pow(count,i)+ "  ");
            }
            count++;
            System.out.println();
        }
    }
}
