package StreamAPI;

import java.util.stream.Stream;

public class StreamToArray {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("a", "b", "c");

        String[] stringArray = stringStream.toArray(e -> new String[e]);

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }
}
