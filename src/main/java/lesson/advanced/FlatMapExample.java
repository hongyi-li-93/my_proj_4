package lesson.advanced;

import lesson.advanced.steams.SchoolClass;
import lesson.advanced.steams.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    private static List<SchoolClass> createClasses() {
        SchoolClass ChrisClass = new SchoolClass("chris");
        ChrisClass.addStudent(new Student("jane", 25, "111222"));
        ChrisClass.addStudent(new Student("bob", 25, "111222"));
        ChrisClass.addStudent(new Student("tom", 25, "111222"));

        SchoolClass ShaneClass = new SchoolClass("shane");
        ShaneClass.addStudent(new Student("amy", 25, "111222"));
        ShaneClass.addStudent(new Student("nick", 25, "111222"));
        ShaneClass.addStudent(new Student("bella", 25, "111222"));

        return Arrays.asList(ChrisClass, ShaneClass);
    }

    public static void main(String[] args) {
        List<SchoolClass> myClasses = createClasses();
        //System.out.println(myClasses);
        List<List<String>> allStudents = myClasses.stream().
                map(ccls -> ccls.getStudents().stream().map(Student::getName).collect(Collectors.toList())).
                collect(Collectors.toList());
        System.out.println(allStudents);

        List<String> listAllStudents = myClasses.stream().
                flatMap(ccls -> ccls.getStudents().stream().map(Student::getName)).collect(Collectors.toList());
        System.out.println(listAllStudents);
    }
}
