package chapter17;

import java.util.function.BiConsumer;

public class Example2 {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (name, age)-> {
            System.out.println(name + " is " + age + " years old");
        };
        biConsumer.accept("simi", 18);
    }
}
