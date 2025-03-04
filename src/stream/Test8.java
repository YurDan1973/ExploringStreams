package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        // Изменим имена на заглавные буквы и отсортируем по курсам
//        Map<Integer, List<Student>> map = students.stream().map(e1 -> {
//                    e1.setName(e1.getName().toUpperCase());
//                    return e1;
//                })
//                .collect(Collectors.groupingBy(e1 -> e1.getCourse()));
//
//        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
//        }
        // Метод groupingBy() группирует по

        // Далее разделим студентов на тех, кто получает высокую
        // оценку и тех, кто получает низкую оценку

        Map<Boolean, List<Student>> map =
                students.stream()
                        .collect(Collectors.partitioningBy(e1 -> e1.getAvgGrade() > 7));

        for (Map.Entry<Boolean, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
        // Метод partitioningBy() разделяет по
    }
}
