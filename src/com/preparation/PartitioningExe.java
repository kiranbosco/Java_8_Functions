package com.preparation;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;

public class PartitioningExe {

    public static Predicate<Student> studentPredicate =(student -> student.getGpa()>3.8);


    public static void partitioningExe(){
      Map<Boolean, List<Student>> booleanListMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(studentPredicate));
        System.out.println(booleanListMap);
    }

    public static void partitioningBySeparateOdd_EvenNumber(){
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7);
     Map<Boolean, List<Integer>> integerListMap =   integerList.stream()
                .collect(partitioningBy(i-> (i%2==0)));
        System.out.println( integerListMap);
    }

    public static void main(String[] args) {
      //  partitioningExe();
        partitioningBySeparateOdd_EvenNumber();

    }
}
