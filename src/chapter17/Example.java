package chapter17;

import java.util.function.Consumer;

public class Example {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (Integer number)-> System.out.println("number passed to accept::"+number);
        consumer.accept(5);
    }
}
