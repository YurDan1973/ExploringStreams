// Когда мы работаем со стримом по умолчанию используются sequential streams (последовательные потоки)
// т.е. пока мы сами не укажем, что нам необходимо использовать parallel streams (параллельные потоки)
// будут использоваться sequential streams (последовательные потоки)
// parallel stream - это возможность использования нескольких ядер процессора при выполнении
// каких либо операци со стримом.
// Сделать стрим параллельным можно двумя способами: 1) используя метод parallelStream(), например:
// list.parallelStream(). ... (это когда стрим на ходу сощдаётся из, например коллекции)
// или 2) используя метод parallel() это когда стрим создаётся с нуля,
// например Stream<T> s = Stream.of(...);  s.parallel(). ...
// параллельные стримы лучше использовать только когда у нас много элементов и не важна очерёдность
// операций с этими элементами, например сложение и умножение

package stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    // 1 2 3 4 ... 1000000000
    // 1 250000000
    // 250000001 500000000
    // 500000001 750000000
    // 750000001 1000000000
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sumResult = list.parallelStream()
                .reduce((accumulator, element) -> accumulator + element).get();
        System.out.println("sumResult = " + sumResult);
//  Ответ верный для сложения

//        double divisionResult = list.parallelStream()
//                .reduce((accumulator, element) -> accumulator / element).get();
//        System.out.println("divisionResult = " + divisionResult);
////  Ответ неверный для деления
    }
}
