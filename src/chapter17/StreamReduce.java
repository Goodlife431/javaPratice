package chapter17;

import java.util.stream.IntStream;

public class StreamReduce {
    public static void main(String[] args) {
        System.out.printf("Sum of 1 to 10: %d%n", IntStream.rangeClosed(1,10).sum());
    }
}
