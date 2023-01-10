package lesson.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StudentRegistry {
    private List<String> students = new ArrayList<>();

    void registerStudent(String name){
        students.add(name);
    }

    void printAll(){
//        Printer printer = new Printer() {
//            @Override
//            public void print(String name) {
//                System.out.println(name);
//            }
//        };
//
//        for(String student: students) {
//            printer.print(student);
//        }

        students.forEach(System.out::println);

    }

    void printAll(Consumer<String> printer) {
        students.forEach(printer);
    }

    private interface Printer {
        void print(String name);
    }

}
