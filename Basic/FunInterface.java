package Basic;

@FunctionalInterface
public interface FunInterface {
    public int sum(int a, int b);

    public static void multi(int a, int b) {
        System.out.println(a * b);
    }

    public default void sub(int a, int b) {
        System.out.println(a - b);
    }
}
