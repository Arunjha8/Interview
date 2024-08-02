package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBinary {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\custompic.jpg");
        FileOutputStream out = new FileOutputStream("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\TestBinary1.jpg");

        int ch = in.read();
        while (ch != -1) {
            System.out.print((char) ch);
            out.write(ch);
            ch = in.read();
        }
        out.close();
        in.close();
    }
}
