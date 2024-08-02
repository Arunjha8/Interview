package IO;

import java.io.*;
import java.util.Scanner;

public class TestFileSplit {
    public static void main(String[] args) throws IOException {
        int count = 0;
        File fileToSplit = new File("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\SplitFile.txt");
        Scanner sc = new Scanner(fileToSplit);

        while (sc.hasNext()) {
            sc.next();
            count++;
        }
        System.out.println("Lines in the file : " + count);
        int numberOfFiles = 0;
        if (count % 2 == 0) {
            numberOfFiles = count / 2;
        } else {
            numberOfFiles = (count / 2) + 1;
        }
        System.out.println("Number of file to be generated : " + numberOfFiles);
        FileReader fileReader = new FileReader(fileToSplit);
        BufferedReader br = new BufferedReader(fileReader);
        for (int i = 1; i <= numberOfFiles; i++) {

            PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\Arun\\OneDrive\\Desktop\\XYZ\\AfterSplitFile" + i + ".txt"));
            for (int j = 1; j <= 2; j++) {
                String line = br.readLine();
                if (line != null) {
                    out.println(line);
                }
            }
            out.close();
        }
        fileReader.close();
    }
}
