package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDeserialization {

    public static void main(String[] args) throws IOException {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\serialization_Files/student.txt"));
            StudentSerialization s = (StudentSerialization) ois.readObject();
            System.out.println(s.id + " " + s.name);

            ois.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
