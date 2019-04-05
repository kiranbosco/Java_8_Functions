package functionalInterfaces.Optional;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalClassExample {

    // this class is used to avoid the null pointer exception
    public  static Optional<String> getStudentNames(){

     //  Optional<Student>studentOptional= Optional.ofNullable(StudentDataBase.studentSupplier.get());
     Optional<Student> studentOptional = Optional.ofNullable(null);
        if (studentOptional.isPresent()) {
            return studentOptional.map(Student::getName);
        }
        return  Optional.empty();
    }

    public static void main(String[] args) {

        Optional<String> stringOptional = getStudentNames();
        if(stringOptional.isPresent()){
            System.out.println(stringOptional.get().length());
        }
        else {
            System.out.println("Student name not found here");
        }
    }
}
