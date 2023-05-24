package Practice;

import java.security.SecureRandom;

/*You roll two dice. Each die has six faces, which contain one, two, three, four, five and
six spots, respectively. After the dice have come to rest, the sum of the spots on the two
upward faces is calculated. If the sum is 7 or 11 on the first throw, you win. If the sum
is 2, 3 or 12 on the first throw (called “craps”), you lose (i.e., the “house” wins). If the
sum is 4, 5, 6, 8, 9 or 10 on the first throw, that sum becomes your “point.” To win,
you must continue rolling the dice until you “make your point” (i.e., roll that same
point value). You lose by rolling a 7 before making your point.*/
public class CrapsPractice {
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    private enum Status{WIN,LOSE,CONTINUE}


    public static int rollDice(){
        SecureRandom random = new SecureRandom();
        int dice1 = 1 + random.nextInt(6);
        int dice2 = 1 + random.nextInt(6);

        int sum = dice1 + dice2;
        System.out.printf("player rolled %d + %d, sum of dice is: %d%n",dice1,dice2,sum);

        return sum;
    }

    public static void Main(){
        Status gameStatus;
        int myPoint = 0;
        int sumOfDice = rollDice();
        switch (sumOfDice){
            case 7:
            case 11:
                gameStatus = Status.WIN;
                System.out.printf("My point is: %d%n\n YOU WIN",sumOfDice);
                break;
            case 2:
            case 3:
            case 12:
                gameStatus = Status.LOSE;
                System.out.printf("My point is: %d%n\n YOU LOSE");
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("My point is %d%n",myPoint);
                break;
        }
        while (gameStatus == Status.CONTINUE){
            sumOfDice = rollDice();
            if (sumOfDice == myPoint){
                gameStatus = Status.WIN;
            } else if (sumOfDice == SEVEN) {
                gameStatus = Status.LOSE;
            }
        }
    }

}
