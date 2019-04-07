package files;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStream {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("/C:\\Users\\lenovo\\Documents.text");
        fileOutputStream.write(65);
        fileOutputStream.close();
        System.out.println("success...");
    }
}
