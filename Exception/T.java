package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class T {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Arun\\OneDrive\\Desktop\\Interview Theory\\Revision.txt");
        try {
            Scanner scanner = new Scanner(file);
            //           try {
            String line = scanner.nextLine();
            System.out.println(line);
        } catch (NoSuchElementException e) {
            System.err.println("Reached the end of the file: " + e.getMessage());
        }
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
    }
}
