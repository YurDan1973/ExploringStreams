package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
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

//        students.stream().map(e ->
//        {
//            e.setName(e.getName().toUpperCase());
//            return e;
//        })
//                .filter(e -> e.getSex() == 'f')
//                .sorted((x,y) -> x.getAge() - y.getAge())
//                .forEach(e -> System.out.println(e));

// Требуется отфильтровать студентов и оставить только тех, возраст которых больше 22 года
// и средняя оценка меньше 7.2
// Используем метод filter()

//        List<Student> students2 = new ArrayList<>();
//        students2 = students.stream().filter(element -> element.getAge() > 22 && element.getAvgGrade() < 7.2)
//                .collect(Collectors.toList());
//        System.out.println(students2);

// Стрим не обязательно создавать из чего-то (коллекции, массива и др.)
// Стрим также можно создать совершенно с нуля, например:
//        Stream<Student> myStream = Stream.of(st1, st2, st3, st4, st5);
//        myStream.filter(element -> element.getAge() > 22 && element.getAvgGrade() < 7.2)
//                .collect(Collectors.toList());

        Student first = students.stream().map(e ->
                {
                    e.setName(e.getName().toUpperCase());
                    return e;
                })
                .filter(e -> e.getSex() == 'f')
                .sorted((x,y) -> x.getAge() - y.getAge())
                .findFirst().get();
        System.out.println(first);

    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.setName(name);
        this.setSex(sex);
        this.setAge(age);
        this.setCourse(course);
        this.setAvgGrade(avgGrade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}

