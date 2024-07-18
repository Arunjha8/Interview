package StreamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {
    public static void main(String[] args) {
        String[] s = {"abc", "ghi", "jkl", "def"};

        //   Stream stream = Arrays.stream(s);
        //   stream.sorted().forEach(System.out::println);

        Arrays.stream(s).sorted().forEach(System.out::println);

        System.out.println("-------------------");

        Stream<String> stream1 = Arrays.stream(s);

        stream1.map(e -> e.toUpperCase()).sorted().forEach(e -> System.out.println(e));
    }
}
// System.out::println ka matlab hai "standard output stream ka println method call karo."