package functionalInterfaces.Optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalFilterMapFlatMapper {

    public static void optionalFilerExe(){
       Optional<Student> studentOptional =Optional.ofNullable(StudentDataBase.studentSupplier.get());
       studentOptional.filter(student -> student.getGpa()>=3.9)
                .ifPresent(student -> System.out.println(student));
    }

    public static void main(String[] args) {

        optionalFilerExe();
    }

}
