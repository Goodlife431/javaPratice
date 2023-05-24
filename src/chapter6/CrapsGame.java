package chapter6;

import java.security.SecureRandom;

public class CrapsGame {
    private static final SecureRandom random = new SecureRandom();
    public static final int seven = 7;
    public static final int eleven = 11;
    public static final int two = 2;
    public static final int three = 3;
    public static final int twelve = 12;

    public enum Status {CONTINUE, LOSE, WIN};

    public static int rollDice(){
        int dice1 = 1 + random.nextInt(6);
        int dice2 = 1 + random.nextInt(6);
        int sum = dice1 + dice2;
        System.out.printf("rolled: %d + %d = %d%n",dice1,dice2,sum);
        return sum;
    }


}
