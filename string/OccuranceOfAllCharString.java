package string;

public class OccuranceOfAllCharString {
    public static void main(String[] args) {
/*
        StringBuffer sb = new StringBuffer("Arun Ojha");
        String s = sb.toString();
        String name = s.toLowerCase();
        */
        String name = "arun ojha";
        int count = 0;
        for (char a = 'a'; a <= 'z'; a++) {
            for (int i = 0; i < name.length(); i++) {
                if (a == name.charAt(i)) {
                    count++;
                }
            }
            if (count != 0) {
                System.out.println(a + " = " + count);
                count = 0;
            }
        }
    }
}
