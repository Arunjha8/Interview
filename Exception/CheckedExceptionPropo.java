package Exception;

public class CheckedExceptionPropo {
    public static void main(String[] args) {
        try {
            dad();
        } catch (CheckedMistakeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void dad() throws CheckedMistakeException {
        mom();
    }

    public static void mom() throws CheckedMistakeException {
        son();
    }

    public static void son() throws CheckedMistakeException {
        CheckedMistakeException e = new CheckedMistakeException();
        throw e;
    }
}
