package Basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreammm {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One", "Two", "Three", "Three", "Four");

        list.stream().filter(e -> e.startsWith("T")).distinct().map(e -> e.toUpperCase()).sorted().collect(Collectors.toList()).forEach(e -> {
            System.out.println(e);
        });
        //create Stream
        Stream<String> stream = list.stream();
        //print all element from stream
//        stream.forEach(e -> {
//            System.out.println(e);
//        });

        //Sort the elements and then print
//        stream.sorted().forEach(e -> {
//            System.out.println(e);
//        });

        //convert each element to uppercase then print
//        list.stream().map(e -> e.toUpperCase()).forEach(e -> {
//            System.out.println(e);
//        });

        //Filter elements starting with T character and  print
//        list.stream().filter(e -> e.startsWith("T")).map(e -> e.toUpperCase()).forEach(e -> {
//            System.out.println(e);
//        });

        //Remove duplicate elements
//        list.stream().filter(e -> e.startsWith("T")).distinct().map(e -> e.toUpperCase()).forEach(e -> {
//            System.out.println(e);
//        });

        //AllTogether
//        list.stream().filter(e -> e.startsWith("T")).distinct().map(e -> e.toUpperCase()).sorted().forEach(e -> {
//            System.out.println(e);
//        });

        //Get collection from Stream
//        List<String> l = list.stream().filter(e -> e.startsWith("T")).distinct().map(e -> e.toUpperCase()).sorted().collect(Collectors.toList());
//        System.out.println(l);
    }
}
