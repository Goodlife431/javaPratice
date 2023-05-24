package chapter4;

public class StudentDriver {
    public static void main(String[] args) {
        Student file1 = new Student("simi",90.0);
        Student file2 = new Student("amirah", 60.0);

        System.out.printf("%s Your letterGrade is :%s",
        file1.getName(), file1.getLetterGrade());
        System.out.println();

        System.out.printf("%s Your letterGrade is: %s", file2.getName(), file2.getLetterGrade());
    }
}
