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
        l.add(new ContestantWinner("854564512", "ojha"));

        l.stream().map(c -> c.getName() + " " + c.getPhoneno()).distinct().sorted(Collections.reverseOrder()).collect(Collectors.collectingAndThen(Collectors.toList(), c -> {
            Collections.shuffle(c);
            return c.stream();
        })).forEach(c -> System.out.println(c));

//        l.stream().map(e -> e.getPhoneno()).filter(e -> e.length() == 10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
//            Collections.shuffle(e);
//            return e.stream();
//        })).limit(5).forEach(e -> System.out.println(e));
    }
}
