package chapter5;

import java.util.Scanner;

public class StudentGradeClassWorkTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int studentGrade = 0;
        while (count < 5) {
            System.out.println("Enter Student name: ");
            String name = input.next();
            System.out.println("Enter Student grade: ");
            studentGrade = input.nextInt();
            count++;
        }
        System.out.printf("%s%20s", "studentName", "StudentGrade");
        StudentGradeClassWork.grade(studentGrade);

    }
}
