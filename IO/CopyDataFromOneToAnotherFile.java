package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataFromOneToAnotherFile {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\copydata.txt");

        FileOutputStream out = new FileOutputStream("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\copydata1.txt");
        int i;
        while ((i = in.read()) != -1) {
            out.write(i);
        }
        in.close();
        out.close();
        System.out.println("complete");
    }
}
