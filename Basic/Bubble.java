package Basic;

public class Bubble {
    public static void main(String[] args) {
        int[] t = {10, 20, 90, 50, 80};
        int temp = 0;
        for (int i = 0; i < t.length; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i] > t[j]) {
                    temp = t[j];
                    t[j] = t[i];
                    t[i] = temp;
                }
            }
            System.out.println(t[i]);
        }
    }
}
