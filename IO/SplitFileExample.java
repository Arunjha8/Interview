package IO;

import java.io.*;
import java.util.Scanner;
//Yugal
public class SplitFileExample {
    public static void main(String[] args) throws IOException {
        // Find no of Lines
        String s = "C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\new.txt";
        int count = 0;
        int nol = 2;

        File f = new File(s);
        Scanner sc = new Scanner(f);

        while (sc.hasNext()) {
            sc.next();
            count++;
        }
        System.out.println("No of Lines = " + count);
        //No of Files
        int temp = count % nol;
        int rem = count % nol;
        int nof = 0;
        if (temp != 0) {
            nof = temp;
            if (rem != 0) {
                nof++;
            } else {
                nof = temp;
            }
        }
        System.out.println("No of Files = " + nof);

        //Create file and write data
        BufferedReader br = new BufferedReader(new FileReader(s));
        String strLine;
        for (int j = 1; j <= nof; j++) {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\AfterSplit" + j + ".txt"));
            strLine = br.readLine();
            for (int i = 0; i <= nol; i++) {
                if (strLine != null) {
                    bw.write(strLine);
                    strLine = br.readLine();
                    if (i != nol) {
                        bw.newLine();
                    }
                }
            }
            bw.close();
        }
        br.close();
    }
}
