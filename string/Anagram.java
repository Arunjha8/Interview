package string;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "know";
        String s2 = "nowk";
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1, a2)) {
            System.out.println(s1 + " " + s2 + " They are Anagram");
        } else {
            System.out.println(s1 + " " + s2 + "They Are Not Anagram");
        }
    }
}
