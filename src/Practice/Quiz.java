package Practice;

import java.util.Scanner;

/* A class of ten students took a quiz. The grades (integers in the range 0–100) for this
quiz are available to you. Determine the class average on the quiz. */
public class Quiz {

    public static void main(String[] args) {
       /* int grade;
        int sum = 0;
        int counter = 1;
        int average = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a grade:  ");
        grade = input.nextInt();


        while (counter <= 10){
            System.out.println("Enter a student grade: ");
            grade = input.nextInt();
            sum = grade + sum;
            counter++;
        }
        average = sum/10;


        System.out.printf("%d sum of average and class average is %d: ",sum,average);

    }
    A college offers a course that prepares students for the state licensing exam for real-estate
brokers. Last year, ten of the students who completed this course took the exam. The college
wants to know how well its students did on the exam. You’ve been asked to write a
program to summarize the results. You’ve been given a list of these 10 students. Next to
each name is written a 1 if the student passed the exam or a 2 if the student failed.
Your program should analyze the results of the exam as follows:
1. Input each test result (i.e., a 1 or a 2). Display the message “Enter result” on the
screen each time the program requests another test result.
2. Count the number of test results of each type.
3. Display a summary of the test results, indicating the number of students who
passed and the number who failed.
4. If more than eight students passed the exam, print “Bonus to instructor!”
} */

        int counter = 1;
        int result;
        int passed = 0;
        int failed = 0;
        Scanner input = new Scanner(System.in);

        while (counter <= 10) {
            System.out.println("Enter result(1 for pass or 2 for fail):");
             result = input.nextInt();
            if (result == 1) {
               passed = passed + 1;
                if (result == 2) {
                  failed = failed + 1;
        }
            }
            counter ++;
        }
        if(passed > 8 ){
            System.out.println("bonus to instructor ");
        }


        System.out.println("total student that passed: "+ passed);
        System.out.println("total student that failed: "+ failed);
    }
}




