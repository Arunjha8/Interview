package StreamAPI;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinimumMaximum {
    public static void main(String[] args) {
        int[] i = {1, 2, 3, 4, 5};

        Arrays.stream(i).min().ifPresent(e -> System.out.println(e));
    }
}
