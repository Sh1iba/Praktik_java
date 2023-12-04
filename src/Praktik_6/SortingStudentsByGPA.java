package Praktik_6;
import java.util.Comparator;
import java.util.List;


class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) { //сравниваются итоговые баллы двух студентов (student1 и student2).
        return Integer.compare(student2.getGPA(), student1.getGPA()); //используется для сравнения с учетом порядка сортировки по убыванию.
    }

    public void quickSort(List<Student> students, int low, int high) { //осуществляет сортировку списка студентов методом быстрой сортировки
        if (low < high) {
            int pi = partition(students, low, high);
            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }

    private int partition(List<Student> students, int low, int high) { //вычисляет позицию опорного элемента (mid) в массиве и переставляет элементы так, чтобы все элементы с более высокими итоговыми баллами находились слева от опорного элемента.
        Student mid = students.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (compare(students.get(j), mid) > 0) {
                i++;
                swap(students, i, j);
            }
        }

        swap(students, i + 1, high);
        return i + 1;
    }

    private void swap(List<Student> students, int i, int j) {
        Student temp = students.get(i);
        students.set(i, students.get(j));
        students.set(j, temp);
    }
}


