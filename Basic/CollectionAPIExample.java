package Basic;

import java.util.ArrayList;
import java.util.List;

public class CollectionAPIExample {
    public static void main(String[] args) {
        // Create a new ArrayList of strings
        List<String> myList = new ArrayList<String>();

        // Add elements to the list
        myList.add("apple");
        myList.add("banana");
        myList.add("cherry");
        System.out.println(myList);

        // Access elements in the list
        String firstElement = myList.get(0);
        System.out.println("First element: " + firstElement);

        // Iterate over the list
        for (String fruit : myList) {
            System.out.println(fruit);
        }

        // Remove an element from the list
        myList.remove("cherry");
      //  System.out.println(myList.remove("banana"));
        // Check if an element is in the list
        boolean hasCherry = myList.contains("cherry");
        System.out.println("Has cherry: " + hasCherry);
    }
}
