package IO.Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDeSerialization {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\SerObj.txt"));

        Employee e = (Employee) in.readObject();

        System.out.println("id = " + e.id);
        System.out.println("name = " + e.name);
        System.out.println("address = " + e.address);
        System.out.println("salary = " + e.salary);

        in.close();
    }
}
