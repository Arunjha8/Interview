package Exception;

public class CheckedExceptionPropo {
    public static void main(String[] args) {
        dad();
    }

    public static void dad() {
        try {
            mom();
        } catch (CheckedMistakeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void mom() throws CheckedMistakeException {
        son();
    }

    public static void son() throws CheckedMistakeException {
        CheckedMistakeException e = new CheckedMistakeException();
        throw e;
    }
}
