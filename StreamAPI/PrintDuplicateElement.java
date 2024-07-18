package StreamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateElement {
    public static void main(String[] args) {
        List l = Arrays.asList(2, 4, 4, 5, 6, 6, 7, 7);

        Set s = new HashSet();

        l.stream().filter(n -> !s.add(n)).forEach(e -> System.out.println(e));
    }
}
