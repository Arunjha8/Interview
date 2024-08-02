package IO;

import java.io.*;

public class EmailReadWrite {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\mail.txt"));

        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\mailWrite.txt"));

        String s = br.readLine();
        while (s != null) {
            if (s.endsWith("@gmail.com")) {
                pw.println(s);
                System.out.println(s);
            }
            s = br.readLine();
        }
        pw.close();
    }
}
