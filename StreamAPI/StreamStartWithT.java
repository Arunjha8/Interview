package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamStartWithT {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three", "four", "Three");

        list.stream().map(e -> e.toUpperCase()).filter(e -> e.startsWith("T")).sorted().distinct().forEach(System.out::println);
    }
}
