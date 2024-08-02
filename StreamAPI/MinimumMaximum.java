package StreamAPI;

import java.util.Arrays;

public class MinimumMaximum {
    public static void main(String[] args) {
        int[] i = {1, 2, 3, 8, 5};

        Arrays.stream(i).min().ifPresent(e -> System.out.println("Minimum = " + e));
        Arrays.stream(i).max().ifPresent(e -> System.out.println("Maximum = " + e));
    }
}
