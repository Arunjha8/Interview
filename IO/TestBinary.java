package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBinary {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\custompic.jpg");
        FileOutputStream out = new FileOutputStream("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\TestBinary1.jpg");

        int i = in.read();
        while (i != -1) {
            //  System.out.print((char) i);
            out.write(i);
            i = in.read();
        }
        out.close();
        in.close();
    }
}
