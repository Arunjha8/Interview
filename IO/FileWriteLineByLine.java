package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteLineByLine {
    public static void main(String[] args) throws IOException {
        //   BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\FileWriteLineByLine.txt"));
        PrintWriter bw = new PrintWriter(new FileWriter("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\FileWriteLineByLine.txt"));
        bw.write("Hi, ");
        bw.println("SunRays");
        bw.write("How ");
        bw.print("are ");
        bw.print("you ?");
        bw.close();
        // we can use write and print method.
    }
}
