package StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ContestantWinnerTest {
    public static void main(String[] args) {
        List<ContestantWinner> l = new ArrayList();
        l.add(new ContestantWinner("8978456532", "arun"));
        l.add(new ContestantWinner("9875645123", "ojha"));
        l.add(new ContestantWinner("9835214785", "lavish"));
        l.add(new ContestantWinner("8545645123", "ojha"));

        l.stream().map(c -> c.getName() + " " + c.getPhoneno()).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), c -> {
            Collections.shuffle(c);
            return c.stream();
        })).limit(3).forEach(c -> System.out.println(c));
    }
}
