package lesson.advanced;

import lesson.advanced.steams.SchoolClass;
import lesson.advanced.steams.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Integer> myNums = Arrays.asList(4,5,6,7,8);
        Integer rst = myNums.stream().reduce(5, (cum, nb) -> {return cum + nb;});
        System.out.println(rst);

        List<SchoolClass> schoolClasses = createClasses();
        SchoolClass vanaClass = new SchoolClass("vana");
        System.out.println("vana students: " + vanaClass.getStudents());
        System.out.println("vana size: " + vanaClass.getStudents().size());

        schoolClasses.stream().reduce(vanaClass, (compc, closc) -> {
            System.out.println("Cloning");
            compc.getStudents().addAll(closc.getStudents());
            System.out.println("vana students: " + vanaClass.getStudents());
            System.out.println("vana size: " + vanaClass.getStudents().size());
            return compc;
        });

        System.out.println("vana students: " + vanaClass.getStudents());
        System.out.println("vana size: " + vanaClass.getStudents().size());

        SchoolClass vanaClass1 = schoolClasses.stream().collect(SchoolClass::new, SchoolClass::merge, SchoolClass::merge);
        System.out.println("vana1 students: " + vanaClass1.getStudents());
        System.out.println("vana1 size: " + vanaClass1.getStudents().size());

    }

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
}
