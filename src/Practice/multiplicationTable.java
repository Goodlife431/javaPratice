package Practice;

public class multiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9 + 1; j++) {
                System.out.print("  "+i+ " "+ j);

            }
            System.out.println();
        }
    }
}
