package IO;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\createfile.txt");
        if (f.createNewFile()) {
            System.out.println("file Successfully created.......");
        } else {
            System.out.println("File Is Already Existed........");
        }
    }
}
