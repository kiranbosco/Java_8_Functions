package com.consumer;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExe {

    //Biconsumer can take the two paramater and it does not return any value it consit the two methods accpt(), andThen()
    public static void biConsumerExample(){

        BiConsumer<String , String> biConsumer =(a,b)-> System.out.println(a +  " " +  b);
        biConsumer.accept("Jesus","Mother Mery");

        BiConsumer<Integer,Integer> integerIntegerBiConsumer=(a,b)-> System.out.println( a+b);
     //   integerIntegerBiConsumer.accept(5,2);


        BiConsumer<Integer,Integer> consumer=(a,b)-> System.out.println( a*b);
        integerIntegerBiConsumer.andThen(consumer).accept(5,2);
    }

    public static void listOfStudentData() {

       BiConsumer<String ,List<String>> biConsumer =(name,activities)-> {
           System.out.println(name + " " + activities);
       };
           List<Student> listOf = StudentDataBase.getAllStudents();
           listOf.forEach(stu -> biConsumer.accept(stu.getName(), stu.getActivities()));
       }

       public static void listfoGpa(){
        BiConsumer<String,Integer> biConsumer =(name,gradelevel)->{
            System.out.println(name + " " + gradelevel);
        };
       List<Student>students = StudentDataBase.getAllStudents();
       students.forEach(student -> {
           biConsumer.accept(student.getName(),student.getGradeLevel());
       });
       }

        public static void main(String[] args) {


            listfoGpa();
            listOfStudentData();
            biConsumerExample();
    }
}
