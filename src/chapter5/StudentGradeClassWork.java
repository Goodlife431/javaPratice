package chapter5;
 // 5.17 (Student Grades) A group of five students earned the following grades: Student 1, ‘A’; stu￾dent 2, C’; student 3, ‘B’; student 4, ‘A’ and student 5, ‘B’. Write an application that reads a series
//of pairs of numbers as follows:
//a) student name
//b) student letter grade
//Your program should use a switch statement to determine how many students got a grade of ‘A’,
//how many got a grade of ‘B’, how many got a grade of ‘C’, and how many got a grade of ‘D’. Use a
//loop as needed to input the five student grades, and then finally display the results. //

public class StudentGradeClassWork {
    static int countA = 0;
    static int countB = 0;
    static int countC = 0;
    static int countD = 0;

    public static void grade(int grade) {
        switch (grade / 10) {
            case 10, 9 -> countA++;
            case 8 -> countB++;
            case 7 -> countC++;
            case 6 -> countD++;
            case 5 -> System.out.println("\nE");
            default -> System.out.println("\nF");
        }

    }


}
