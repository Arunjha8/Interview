package IO;

import java.io.*;

public class TestCorrectEmail {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\Emails.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\EmailsCorrectWrite.txt"));

        String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        String line = in.readLine();
        while (line != null) {
            if (line.matches(emailreg)) {
                out.println(line);
            }
            line = in.readLine();
        }
        out.close();
        in.close();
    }
}
