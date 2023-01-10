package lesson.advanced;

import lesson.advanced.steams.SchoolClass;
import lesson.advanced.steams.Student;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMapExample {
    public static void main(String[] args) {
        List<Student> students = findStudent();
        Map<String, Student> studentMap1 = students.stream().collect(
                Collectors.toMap(
                        Student::getName,
                        Function.identity(),
                        (a, b) -> b,
                        LinkedHashMap::new
                ));

        System.out.println(studentMap1);
        System.out.println(studentMap1.getClass());

    }

    private static List<Student> findStudent() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("shane", 25, "1112223333"));
        students.add(new Student("nick", 25, "1112223333"));
        students.add(new Student("chai", 25, "1112223333"));
        students.add(new Student("nick", 35, "1114443333"));
        return students;
    }
}
