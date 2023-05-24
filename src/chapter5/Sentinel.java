package chapter5;

import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        //todo a small app like jumia that collects 10 valid scores and output.txt sum
        int scoreCount = 0;
        int totalScore = 0;
        Scanner input = new Scanner(System.in);
        //todo all of these till scoreCount = 10
        System.out.println("Enter a score: " + (scoreCount + 1) + "or enter -1 to quit");
        int score = input.nextInt();
        while (score != -1 && scoreCount != 10) {
                //todo collect scores
                System.out.println("Enter a score: " + (scoreCount + 1) + "or enter -1 to quit");
                score = input.nextInt();
                // todo check if score is valid
                if (score >= 0 && score <= 100) {
                    //todo add to total valid score
                    totalScore += score;
                    //todo increment scoreCount
                    scoreCount++;
                }
        }
        System.out.println("total score is "+totalScore);
    }
}
