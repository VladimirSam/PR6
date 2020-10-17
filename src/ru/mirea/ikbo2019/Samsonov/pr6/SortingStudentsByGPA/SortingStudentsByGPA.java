package ru.mirea.ikbo2019.Samsonov.pr6.SortingStudentsByGPA;

import ru.mirea.ikbo2019.Samsonov.pr6.Student.Student;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGpa() - o2.getGpa();
    }
}