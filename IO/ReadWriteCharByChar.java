package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteCharByChar {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\ReadWriteCharByCharWr.txt");
        FileReader fr = new FileReader("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\ReadWriteCharByCharRe.txt");

        int i = fr.read();
        while (i != -1) {
            fw.write((char) i);
            System.out.print((char) i);
            i = fr.read();
        }
        fr.close();
        fw.close();
    }
}
