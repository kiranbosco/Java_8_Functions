package com.preparation;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

    public static void findrepet_charactor(){
        String str = "purini kiran kumar";
        String stringStream = Arrays.stream(str.split("")).filter(s -> str.indexOf(str) != s.lastIndexOf(str))
                        .findAny()
                                .orElse("Not repeated ");



        System.out.println(stringStream);
    }


    public static void main(String[] args) {
        System.out.println(filterStudentExe());

        //pallendram program

        String str ="madam";
      Boolean integerBoolean =  IntStream.range(0,str.length()/2).anyMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));
        System.out.println(integerBoolean);

        findrepet_charactor();

    }
}
