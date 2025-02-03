package stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
//        stream1.filter(e1 -> {
//            System.out.println("!!!");
//            return e1 % 2 == 0;
//        }).collect(Collectors.toList());

//        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
//        Stream<Integer> stream3 = Stream.of(6, 7, 8, 9, 10);
//        Stream<Integer> stream4 = Stream.concat(stream2, stream3);
//        stream4.forEach(System.out::println);

        // Метод concat() не может использоваться в цепочке

        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
//        stream5.distinct().forEach(System.out::println);

        // Метод distinct() выводит стрим без дублей, т.е. только уникальные элементы

//        System.out.println(stream5.count());
//        System.out.println(stream5.distinct().count());

// Стрим послеобработки нельзяя переиспользовать

        System.out.println(stream5.distinct().peek(System.out::println).count());

        // С помощью метода peek() можно узнать что происходит на разных этапах цепочки методов,
        // но в отличие от метода forEach() не в конце, после всего,
        // а в промежутке (т.к. этот метод промежуточный)

    }
}
