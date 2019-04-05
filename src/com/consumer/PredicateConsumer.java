package com.consumer;

import data.Student;
import data.StudentDataBase;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumer {

    // here i am taking predicate and consumer two method() take the predicate values and print the consumer in the values

    static Predicate<Student> p = (s) -> s.getGpa() >= 3.5;
    static Predicate<Student> p1 =(s)->s.getGradeLevel()>=3;
    static BiPredicate<Integer,Double> biPredicate =(gradeLevel,gpa)->gradeLevel>=3.9;

    // static BiPredicate<Integer,Double> biPredicate =(gradeLevel,gpa)->gradeLevel>=3.9;

    /*static BiConsumer<String, List<String>> biConsumer = (name,activities)-> System.out.println(name + " "+ activities);
    Consumer<Student> consumer = (student -> {
        if (p.and(p1).test(student)) {
            biConsumer.accept(student.getName(), student.getActivities());
        }

    });*/


    static BiConsumer<String, List<String>> biConsumer = (name,activities)-> System.out.println(name + " "+ activities);
    Consumer<Student> consumer = (student -> {
        if (biPredicate.test(student.getGradeLevel(),student.getGpa())) {
            biConsumer.accept(student.getName(), student.getActivities());
        }

    });

    public void getNameActivities(List<Student> list){
        list.forEach(consumer);

    }

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        new PredicateConsumer().getNameActivities(students);

    }
}
