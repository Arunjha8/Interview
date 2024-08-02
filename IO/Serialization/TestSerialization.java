package IO.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerialization {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\SerObj.txt"));

        Employee e = new Employee();

        e.id = 1;
        e.name = "Arun";
        e.address = "indore";
        e.salary = 5000;

        out.writeObject(e);
        out.close();
    }
}
