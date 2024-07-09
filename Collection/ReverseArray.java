package Collection;

import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        //Using Arrays.sort
        Integer[] array = {2, 5, 6, 1, 3, 4};
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));


        //Using Lambda Expression
        Integer[] array1 = {20, 50, 60, 10, 30, 40};
        Arrays.sort(array1, (a, b) -> b - a);
        System.out.println(Arrays.toString(array1));


        //Using with stream API
        Integer[] array3 = {50, 60, 90, 80, 70, 100};
        array3 = Arrays.stream(array3).sorted((a, b) -> b - a).toArray(Integer[]::new);
        System.out.println(Arrays.toString(array3));    //Yeh line sorted array ko print kar rahi hai, taki hum result dekh sakein.
//.toArray(Integer[]::new): Yeh sorted stream ko dobara se ek nayi Integer array mein convert karta hai.

        //Using Collections.sort
        Integer[] array4 = {500, 700, 600, 900, 400};
        List<Integer> list = Arrays.asList(array4);
        Collections.sort(list, Collections.reverseOrder());
      //  Collections.sort(list);                             //Arrange in Ascending Order
        list.toArray(array4);
        System.out.println(Arrays.toString(array4));
    }
}
