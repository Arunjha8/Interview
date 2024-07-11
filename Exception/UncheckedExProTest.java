package Exception;

public class UncheckedExProTest {
    public static void main(String[] args) {
        try {
            dad();
        } catch (UncheckedExPro e) {
            System.out.println(e.getMessage());
        }
    }

    public static void dad() {
        mom();
    }

    public static void mom() {
        son();
    }

    public static void son() {
        UncheckedExPro e = new UncheckedExPro();
        throw e;
    }
}
