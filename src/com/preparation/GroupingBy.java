package com.preparation;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class GroupingBy {

    public static void groupingByStudent(){
        Map<String, List<Student>> studetnMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));
        System.out.println(studetnMap);
    }
    public static void customizedGrouping(){
        Map<String,List<Student>> studentDouble =  StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student -> student.getGpa()>3.8 ? "Outstanding": "Average"));
        System.out.println(studentDouble);
    }
    public static void twoLevelGrouping(){
        Map<Integer,Map<String,List<Student>>> studentMapInfor = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,groupingBy(student -> student.getGpa()>3.8 ? "Outstanding" : "Average")));
        System.out.println(studentMapInfor);
    }

    public static void twolevelGrouping1(){
        Map<String, Map<List<String>, List<Student>>> studentString = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,groupingBy(Student::getActivities)));
        System.out.println(studentString);

    }

    public static void twolevelGrouping2(){
        Map<List<String>,Map<String,List<Student>>> studentMap =  StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getActivities,groupingBy(student -> String.valueOf(student.getGender().equals("female")))));
        System.out.println(studentMap);
    }

    public static void main(String[] args) {
        //    groupingByStudent();
//        customizedGrouping();
        //     twoLevelGrouping();

        // twolevelGrouping1();
        twolevelGrouping2();
    }

}
