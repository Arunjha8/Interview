package StreamAPI;

import java.util.stream.Stream;

public class StreamToArray {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("d", "b", "c");
        //  stringStream = stringStream.sorted();
        String[] stringArray = stringStream.toArray(e -> new String[e]);

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }
}
