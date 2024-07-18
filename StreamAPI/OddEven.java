package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class OddEven {
    public static boolean oddEven(int i) {
        if (i % 2 == 0) {
            System.out.print("Even = " + i);
            return true;
        } else if (i % 2 != 0) {
            System.out.print("Odd = " + i);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        list.stream().distinct().filter(e -> oddEven(e)).forEach(c -> System.out.println());
        System.out.println();
        list.stream().distinct().filter(e -> (e % 2 == 0)).forEach(c -> System.out.println("even = " + c));
        System.out.println();
        list.stream().distinct().filter(c -> (c % 2 != 0)).forEach(c -> System.out.println("odd = " + c));
    }
}
