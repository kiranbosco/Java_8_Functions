package com.preparation;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterExe {

    public static Predicate<Student>  nameSpace =(s)->s.getGender().equals("female");
    public static List<String> filterStudentExe(){

        List<String> studentList = StudentDataBase.getAllStudents()
                .stream()
            //    .filter((student -> student.getGender().equals("female")))
                .filter((nameSpace))// you can do it n number of filtrings here
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        return studentList;
    }
    public static void main(String[] args) {
        System.out.println(filterStudentExe());
    }
}
