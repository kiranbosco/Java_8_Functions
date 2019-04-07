package serialization;

import java.io.*;

     public class DserializationWithInheritanceExe {

    public static void main(String[] args) throws  FileNotFoundException {

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\serialization_Files/inheritanceExe.txt"));
            Student student = (Student)ois.readObject();
            System.out.println(student.id + " " + student.name + " " + student.fee + " "+ student.course);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("success ");
        }

    }

}
