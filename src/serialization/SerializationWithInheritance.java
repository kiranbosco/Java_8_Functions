package serialization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// is A relationship
public class SerializationWithInheritance implements Serializable {
     int id;
        String name;
        SerializationWithInheritance(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
class Student extends SerializationWithInheritance{

    String course;
    int fee;
    public Student(int id, String name, String course, int fee) {
        super(id,name);
        this.course=course;
        this.fee=fee;
    }

    public static void main(String[] args)throws IOException {
        try {
            Student student = new Student(10, "kiran", "java", 1000);
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\serialization_Files/inheritanceExe.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(student);
             objectOutputStream.flush();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("success + inheritance Exe");
    }
}

