package Basic;

public class Question18 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int idx = 4;
        System.out.println(add(arr, idx));
    }

    public static int add(int[] a, int b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                System.out.println(i);
            } else {
                System.out.println("-1");
            }
        }
        return 0;
    }
}
