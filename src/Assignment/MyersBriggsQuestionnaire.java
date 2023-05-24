package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyersBriggsQuestionnaire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name ");
        String name = input.nextLine();
        String[] questionA = {
                " 1. A. expend energy, enjoy groups ",
                "2. A. interpret literally ",
                "3. A. logical, thinking, questioning",
                "4. A. organized, orderly",
                "5. A. more outgoing, think out loud",
                "6. A. practical, realistic, experiential",
                "7. A. candid, straight forward, frank",
                "8. A. plan, schedule",
                "9. A. seek many tasks, public activities, interaction with others",
                "10. A. standard, usual, conventional",
                "11. A. firm, tend to criticize, hold the line ",
                "12. A. regulated, structured",
                "13. A. external, communicative, express yourself",
                " 14. A. focus on here-and-now ",
                " 15. A. tough-minded, just ",
                " 16. A. preparation, plan ahead",
                "17. A. active, initiate",
                " 18. A. facts, things, “what is”",
                " 19 .A. matter of fact, issue-oriented",
                "20.  A. control, govern"
        };
        String [] questionB = {
                "1. B. conserve energy, enjoy one on one",
                "2. B. look for meaning and possibilities",
                "3. B. empathetic, feeling, accommodating",
                "4. B. flexible, adaptable",
                "5. B. more reserved, think to yourself",
                "6. B. . imaginative, innovative, theoretical",
                "7. B. b. tactful, kind, encouraging",
                "8. B. unplanned, spontaneous",
                "9. B. seek private, solitary activities with quiet to concentrate",
                "10. B. gentle, tend to appreciate, conciliate",
                "11. B. easygoing, “live” and “let live” ",
                "12. B. internal, reticent, keep to yourself",
                "13. B. look to the future, global perspective, “big picture”",
                "14. B. tender-hearted, merciful",
                "15. B. go with the flow, adapt as you go",
                "16. B. reflective, deliberate",
                "17. B. ideas, dreams, “what could be,” philosophical",
                "18. B. ideas, dreams, “what could be,” philosophical",
                "19. B. sensitive, people-oriented, compassionate",
                "20. B. . latitude, freedom"
        };

     String [] answers = new String[questionA.length];
    for(int counter = 0; counter < questionA.length; counter++){
            System.out.println(questionA[counter] + "  " + questionB[counter]);
            answers[counter] = input.nextLine();
        }
    String [][] check = new String[20][20];
    int counterA = 0;
    int counterB = 0;
    for(int i = 0; i < answers.length; i++){
        if(answers[i].equals("A")){
            System.out.println(questionA[i]);
            counterA++;
        } else {
            if (answers[i].equals("B")) {
                System.out.println(questionB[i]);
                counterB++;
            }
        }
    }
        System.out.println("You choose A  "+counterA+ " Times");
        System.out.println("You choose A  "+counterB+ " Times");
    }
}
