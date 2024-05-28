package string;

public class RemoveDuplicateCharInString {
    public static void main(String[] args) {
        String s1 = "arunojha";
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int dup = s1.indexOf(ch, i + 1);
            if (dup == -1) {
                System.out.println(ch);
            }
        }
// numericvalue
        char[] ch = s1.toCharArray();
        for (int i : ch) {
            System.out.println(i);
        }
    }
}
