package IO;

import java.io.*;

public class ReadFromKeyboard {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\Keyboard.txt"));
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        String s = br.readLine();
        while (!s.equals("quit")) {
            out.println(s);
            s = br.readLine();
        }
        br.close();
        out.close();
        System.out.println("Check your File");

    }
}
