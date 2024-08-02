package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataFromOneToAnotherFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\copydata.txt");

        FileOutputStream fos = new FileOutputStream("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\copydata1.txt");
        int i;
        while ((i = fis.read()) != -1) {
            fos.write(i);
        }
        System.out.println("complete");
    }
}
