package Collection;

import java.util.*;

public class A {
    public static void main(String[] args) {
        List originalList = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 6, 7, 8, 9, 3);
        Set uniqueElements = new HashSet<>();
        Set duplicateElements = new HashSet<>();

        for (Object element : originalList) {
            if (!uniqueElements.add(element)) {
                duplicateElements.add(element);
            }
        }

        List duplicateList = new ArrayList<>(duplicateElements);

        System.out.println("Original List: " + originalList);
        System.out.println("Duplicate Elements: " + duplicateList);
    }
}
