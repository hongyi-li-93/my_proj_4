package lesson.advanced;

import lesson.advanced.steams.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("shane", 25, "111222"));
        students.add(new Student("ting", 25, "111222"));
        students.add(new Student("chiayi", 5, "111222"));

        Set<String> names = students.stream().map(Student::getName).collect(Collectors.toSet());
        //System.out.println(names);
        names.stream().forEach(System.out::println);
        students.stream().forEach(System.out::println);
    }
}
