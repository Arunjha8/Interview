package IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteCharByChar {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ//FileWriteCharByChar.txt");
        char[] c = {'H', 'E', 'L', 'L', 'O'};
        fw.write(c);
        fw.write(',');
        fw.write(" Arun");
        fw.close();
    }
}
