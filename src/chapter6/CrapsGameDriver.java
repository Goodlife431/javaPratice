package chapter6;

import static chapter6.CrapsGame.*;
import static chapter6.CrapsGame.Status.*;

public class CrapsGameDriver {
    public static void main(String[] args) {
        CrapsGame.Status gameStatus;
        int myPoint = 0;


        int sumOfDice = rollDice();
        switch (sumOfDice){
            case seven:
            case eleven:
                gameStatus = WIN;
                break;
            case two:
            case three:
            case twelve:
                gameStatus = LOSE;
                break;
            default:
                gameStatus = CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("My point is: %d",myPoint);
                break;
        }
        while (gameStatus == Status.CONTINUE){
            sumOfDice  = rollDice();

            if (sumOfDice == myPoint){
                gameStatus = Status.WIN;}
                else{
                    if (sumOfDice == seven){
                        gameStatus = Status.LOSE;}
                }
            }
        if(gameStatus == Status.WIN) {
            System.out.println("player wins");}
            else{
            System.out.println("player loses");
        }

        }
    }

