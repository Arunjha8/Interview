package Basic;

import java.util.Arrays;

public class CopyArrayMethod {
    public static void main(String[] args) {
        String[] a = {"Neeraj", "Pradeep", "Yugal", "Shailendra"};
        String[] b = new String[2];
        System.arraycopy(a, 1, b, 0, 2);
        System.out.println(Arrays.toString(b));
    }
}
