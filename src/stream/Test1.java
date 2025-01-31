package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("Ok");
        list.add("poka");

        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());
// Метод map() преобразует каждый элемент потока (стрима) в то, что написано в его параметре
//        System.out.println(list2);

        int[] array = {5, 9, 3, 8, 1};
        int[] array1 = Arrays.stream(array).map(element
                -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();

//        System.out.println(Arrays.toString(array1));
        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela?");
        set.add("Ok");
        set.add("poka");
        System.out.println(set);

        Set<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        List<Integer> list3 = set.stream().map(e -> e.length()).collect(Collectors.toList());
        System.out.println(set2);
        System.out.println(list3);


    }
}
