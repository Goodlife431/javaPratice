package chapter16;

import java.util.*;

public class Example1 {
        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);

            System.out.println("numbers:: "+numbers);

            List<Integer> list = new LinkedList<>();
            list.add(4);
            list.add(3);
            list.add(2);
            list.add(1);

            System.out.println(numbers.containsAll(list));
            System.out.println("numbers:: "+numbers);

            System.out.println("Element at index 2 of numbers -> "+numbers.get(2));

            System.out.println("index of element 3 in numbers -> "+numbers.indexOf(3));
            System.out.println("last index of element 3 in numbers"+numbers.lastIndexOf(3));
            Iterator<Integer> numberIterator = numbers.iterator();
            while ((numberIterator.hasNext())){
                System.out.println(numbers.iterator().next());
                numberIterator.next();
                // numberIterator.remove();
                System.out.println(numbers);
            }


            //todo Spliterator
            Spliterator<Integer> numberSpliterator = numbers.spliterator();
            System.out.println("numbers -> "+numbers);
            Spliterator<Integer> spliterator = numberSpliterator.trySplit();
            System.out.println(spliterator.estimateSize());
            spliterator.forEachRemaining(System.out::println);

            Set<Integer> set = new TreeSet<>();
            set.add(2);
            set.add(3);

            numbers.removeAll(set);
            System.out.println("number after removal-> "+ numbers);


    }
}
