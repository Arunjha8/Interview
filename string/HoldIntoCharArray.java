package string;

import java.util.Arrays;

public class HoldIntoCharArray {
    public static void main(String[] args) {
        String[] name = {"Arun1234"};
        String a = "";
        String b = "";
        for (String s : name) {
            char[] ch = s.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (Character.isDigit(ch[i])) {
                    a = a + ch[i];
                } else {
                    b = b + ch[i];
                }
            }
            int[] intArray = new int[a.length()];
            for (int i = 0; i < a.length(); i++) {
                intArray[i] = Character.getNumericValue(a.charAt(i));
            }
//            char[] c = a.toCharArray();
//            char[] d = b.toCharArray();
//            System.out.println("Character array : " + Arrays.toString(c));
//            System.out.println("Digit array : " + Arrays.toString(d));
            System.out.println("Integer array : " + Arrays.toString(intArray));
        }
    }
}
