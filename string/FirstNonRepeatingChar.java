package string;

public class FirstNonRepeatingChar {
    public static void main(String[] arg) {
        String str = "ABBCDE";
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < ch.length; j++) {
                if (i != j && ch[i] == ch[j]) {
                    unique = false;
                }
            }
            if (unique) {
                System.out.println(ch[i]);
                break;
            }
        }
    }
}
