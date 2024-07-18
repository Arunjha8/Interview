package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighest {
    public static void main(String[] args) {
//        List l = Arrays.asList(100, 200, 300, 800, 400);
        List l = new ArrayList();

        l.add(1000);
        l.add(500);
        l.add(1500);
        l.add(2500);
        l.add(520);

        System.out.print("Highest Salary = ");
        l.stream().distinct().sorted(Collections.reverseOrder()).findFirst().ifPresent(e -> System.out.println(e));

        System.out.print("Second Highest Salary = ");
        l.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().ifPresent(e -> System.out.println(e));
    }
}
