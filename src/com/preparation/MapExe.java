package com.preparation;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MapExe {

    public static List<String> createMapStudent() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .skip(2)
                .collect(Collectors.toList());
    }

    public static List<String> sortingStudent() {
        List<String> studentIfo = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .sorted()
                .collect(Collectors.toList());
        return studentIfo;
    }

    public static List<Student> studentSorting() {
        List<Student> studentIfo = StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        studentIfo.stream()
                .map(Student::getGender)
               // .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
        return studentIfo;

    }


    public static void main(String[] args) {
        //   System.out.println(createMapStudent());
        System.out.println(sortingStudent());
        System.out.println(studentSorting());


    }
}
