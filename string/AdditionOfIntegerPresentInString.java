package string;

public class AdditionOfIntegerPresentInString {

    public static void main(String[] args) {
        String[] name = {"Arun1234"};
        int count = 0;
        for (String s : name) {
            char[] ch = s.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (Character.isDigit(ch[i])) {
                    count += Integer.parseInt(String.valueOf(ch[i]));
                }
            }
        }
        System.out.println(count);
    }
}
