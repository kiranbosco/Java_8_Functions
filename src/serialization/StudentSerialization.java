package serialization;

import java.io.*;

public class StudentSerialization implements Serializable {

int id;
String name;

    StudentSerialization(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

        StudentSerialization student = new StudentSerialization(10, "kiran");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\serialization_Files/student.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.close();
        objectOutputStream.flush();
        System.out.println("success");

    }
}
