package chapter7;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTasks {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Simi");
        strings.add("Adeola");

        strings.remove(1);
        strings.addAll(List.of("problem1", "problem2", "problem3"));

        for (String s : strings) {
            System.out.println(s);

            strings.forEach(System.out::println);
        }

    }
}
