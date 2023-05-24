package Practice;

import java.security.SecureRandom;

public class Random {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        for (int count = 0; count <= 20; count++){
            int face = 1 + random.nextInt(6);
            System.out.printf("%d ",face);
            if (count % 5 == 0){
                System.out.println();
            }
        }
    }
}
