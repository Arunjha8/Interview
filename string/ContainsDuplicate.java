package string;

import java.util.Set;
import java.util.TreeSet;

public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        Set<Integer> s = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (s.contains(nums[i])) {
                System.out.println("true");
            }
            s.add(nums[i]);
        }
        System.out.println("false");
    }
}