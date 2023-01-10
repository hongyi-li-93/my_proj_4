package lesson.advanced.steams;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
@NoArgsConstructor
public class SchoolClass {
    String name;

    List<Student> students = new ArrayList<>();

    public SchoolClass(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public SchoolClass merge(SchoolClass another) {
        this.students.addAll(another.getStudents());
        return this;
    }
}
