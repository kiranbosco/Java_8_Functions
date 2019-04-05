package com.consumer;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

//  consumer can take the one input and perform some operation it doesnt return any value it consist the accpt() and andtThen()
public class ConsumerExemple {

    public static void  consumerExe(){

        Consumer<Student> studentConsumer =(student)-> System.out.println(student);
       List <Student> list = StudentDataBase.getAllStudents();
       list.forEach(studentConsumer);
    }

    // here is the take take two parameters methods look it

    public static void  consumerExe1() { // if you want perform iterate the multiple items u can use the andThen()

        Consumer<Student> studentConsumer = (stu-> System.out.println(stu.getName()));
        Consumer<Student> studentConsumer1 = (s->s.getActivities());
              List<Student>  list = StudentDataBase.getAllStudents();
        list.forEach(studentConsumer.andThen(studentConsumer1));

    }

    public static void  consumerExe2() { // if you want perform iterate the multiple items u can use the andThen()

        Consumer<Student> studentConsumer = (stu-> System.out.println(stu.getName()));

        List<Student>  list = StudentDataBase.getAllStudents();
        list.forEach(stu->{
            if(stu.getGradeLevel()>=4);
            studentConsumer.accept(stu);
        });

    }

        public static void main(String[] args) {
         consumerExe();
            consumerExe2();

        Consumer<String> consumer =(s-> System.out.println(s.toUpperCase()));
        consumer.accept("Jesus Save My Life : ");
    }
}
