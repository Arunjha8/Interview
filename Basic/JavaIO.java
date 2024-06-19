package Basic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class JavaIO {
    public static void main(String[] args) throws IOException {

        //Stream m file ko aise read krte h
//        Stream<String> f = Files.lines(Path.of("data.txt"));
        //  String fileName = "C:\\Users\\Arun\\OneDrive\\Desktop\\Interview Theory\\String.txt";
        //  File file = new File("C:\\Users\\Arun\\OneDrive\\Desktop\\Interview Theory\\String.txt");
// try (Stream<String> linesStream = Files.lines(file.toPath("C:\\Users\\Arun\\OneDrive\\Desktop\\Interview Theory\\String.txt"))) {
        try (Stream<String> linesStream = Files.lines(Path.of("C:\\Users\\Arun\\OneDrive\\Desktop\\Interview Theory\\String.txt"))) {
            linesStream.forEach(line -> {
                System.out.println(line);
            });
        }

    }
}
