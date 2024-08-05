package IO;

import java.io.*;

public class FileMerge {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\Murge.txt"));
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\abc.txt"));

        String s = br.readLine();
        while (s != null) {
            pw.write(s);
            s = br.readLine();
        }
        br.close();
        BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\abcd.txt"));
        String s1 = br1.readLine();
        while (s1 != null) {
            pw.write(s1);
            s1 = br1.readLine();
        }
        br1.close();
        pw.close();
        //Arun
    }
}
