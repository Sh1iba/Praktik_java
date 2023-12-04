package Praktik_6;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student John = new Student("John", 3);
        students.add(John);

        Student Tom = new Student("Tom", 7);
        students.add(Tom);

        Student Din = new Student("Din", 9);
        students.add(Din);

        Student Sam = new Student("Sam", 1);
        students.add(Sam);

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.size() - 1);

        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getGPA());
        }
    }
}