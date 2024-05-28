package Basic;

public class Palindrom {
    public static void main(String[] args) {
        int t = 151;
        int a = t;
        int r;
        int sum = 0;
        while (a > 0) {
            r = a % 10;
            sum = sum * 10 + r;
            a = a / 10;
        }
        if (sum == t) {
            System.out.println("Palindrom Number");
        } else {
            System.out.println("Not Palindrom Number");
        }
    }
}
