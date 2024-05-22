package string;

import java.util.Arrays;

public class ExtractCharArrayFromStringArray {
    public static void main(String[] args) {
        String[] name = {"Arun1234"};
        String a = "";
        String b = "";
        for (String s : name) {
            char[] ch = s.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (Character.isDigit(ch[i])) {
                    a = a + String.valueOf(ch[i]);
                } else {
                    b = b + String.valueOf(ch[i]);
                }
            }
            char[] c = a.toCharArray();
            char[] d = b.toCharArray();
            System.out.println(Arrays.toString(c));
            System.out.println(Arrays.toString(d));
        }
    }
}
