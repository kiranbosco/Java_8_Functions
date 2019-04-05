package com;

import data.Student;
import data.StudentDataBase;

import java.rmi.StubNotFoundException;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {

    static Predicate<Student> p=(s)->s.getGradeLevel()>=3;
    static Predicate<Student> p1=(s)->s.getGpa()>=3.5;


    public static void filterStudentExample(){

       List<Student> list = StudentDataBase.getAllStudents();
       list.forEach(student -> {
           if(p.test(student)){
               System.out.println(student);
           }
       });
        System.out.println();
    }


    public static void filterStudentGpa(){

     List<Student> list =  StudentDataBase.getAllStudents();
     list.forEach(student -> {
         if (p1.test(student)) {
             System.out.println(student);
         }
     });
        System.out.println();

    }
public static void filterStudentGpaAndgradeLevel() {

    List<Student> list = StudentDataBase.getAllStudents();
    list.forEach(student -> {
        if (p.and(p1).test(student)) {
            System.out.println(student);
        }
        System.out.println();
    });
}
    public static void filterStudentName() {
        Predicate<Student> studentPredicate =(j)->j.getName().startsWith("E");
      List<Student> list = StudentDataBase.getAllStudents();
        list.forEach(student -> {
            if(p.and(studentPredicate).and(p1).negate().test(student)){
                System.out.println(student);
            }
            else {
                System.out.println(student);
            }
        });
    }
    public static void main(String[] args) {

        filterStudentExample();
        filterStudentGpa();
        filterStudentGpaAndgradeLevel();
        filterStudentName();
    }

}
