package chapter6;

import java.security.SecureRandom;

public class CrapsGameMethod {
    public int sum;
    public Status status;
    public int point;
    public enum Status {WIN, CONTINUE, LOSE}
    SecureRandom randomNumbers = new SecureRandom();

    public void random(){
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        sum = die1 + die2;
    }
    public Status getStatus(){
        switch (sum) {
            case 7, 11 -> status = Status.WIN;
            case 2, 3, 12 -> status = Status.LOSE;
            default -> {
                status = Status.CONTINUE;
                sum = point;
                break;
            }
        }
        return status;


    }
    public int getPoint(){
        return point;
    }

}
