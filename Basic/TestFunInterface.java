package Basic;

public class TestFunInterface {
    public static void main(String[] args) {
        FunInterface fn = new FunInterface() {
            public int sum(int a, int b) {
                return (a + b);
            }
        };
        int a = 20;
        int b = 10;
        System.out.println(fn.sum(a, b));
        FunInterface.multi(a, b);
        fn.sub(a, b);
    }
}
