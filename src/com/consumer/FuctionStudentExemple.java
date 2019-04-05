package com.consumer;

import data.Student;
import data.StudentDataBase;

import java.util.*;
import java.util.function.Function;

public class FuctionStudentExemple {

    // here function can take the some input and it will be return some output
    static Function<List<Student>, Map<String, Double>> function = (students -> {
        Map<String, Double> doubleMap = new HashMap<>();
        students.forEach(stu -> {
            doubleMap.put(stu.getName(), stu.getGpa());
        });
        System.out.println();

        return doubleMap;
    });




static Function<List<Student>,Map<String,Integer>> function1 =(students -> {
    Map<String,Integer> maps = new HashMap<>();
    students.forEach(stu->{
        maps.put(stu.getName(),stu.getGradeLevel());
    });
    return  maps;
});
 public static void main(String[] args) {
        System.out.println(function.apply(StudentDataBase.getAllStudents()));

     System.out.println(function1.apply(StudentDataBase.getAllStudents()));
    }
}
