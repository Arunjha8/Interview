package string;

public class ExtractVowel {
    public static void main(String[] args) {
        String str1 = "arunojhaAwWEKIXKFODKLPU";
        String str = str1.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;
            }
            if ("aeiouAEIOU".indexOf(c) != -1) {
                System.out.print(c);
            }
        }
        System.out.println();
        System.out.println("No of Vowels : " + count);
    }
}
