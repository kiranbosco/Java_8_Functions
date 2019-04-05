package functionalInterfaces.Optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseOrElseGetExe {

    public static String orElseExe(){

        //  this optional class has avoid the nullpointer exception if ur pass the object as  null how what it will be return see here
      //  Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElse("Name Not Found");
        return name;
    }

    // Optional orElseGet() method this method accept the supplier supplier cant take the any input but it will be return the out put let see here exe
    public static String orElseGetExe() {
      // Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
     Optional<Student> studentOptional =Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseGet(() -> "Sorry i am not able to find ur request here");
        return name;
    }

    /*Optional throws Example this method is accept the again supplier it cant take the input
    but it will be returnt  the output , this orElseThrow method return the new throw exception or runtime Exception
   */
    public  static Student orElseThrowExe(){

     //  Optional<Student> studentOptional =Optional.ofNullable(StudentDataBase.studentSupplier.get());
          Optional<Student> studentOptional =Optional.ofNullable(null);
        Student name = studentOptional.orElseThrow(() -> new RuntimeException("No Data Available Here"));
       return name;
    }

    public static void flatmapExe(){
       Optional<Student>studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
       studentOptional.filter(student -> student.getGpa()>=3.5)
               .flatMap(Student::getBick)
               .map(Bick::getName);
        System.out.println(studentOptional);
    }
    public static void main(String[] args) {

        System.out.println("OrElse Exemple  : " + orElseExe());
        System.out.println("OrElseGet Exemple : " + orElseGetExe());
        System.out.println("OrElseThrow Example : " + orElseThrowExe());
        flatmapExe();
    }
}

