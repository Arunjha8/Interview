package Basic;

public class TestSwitch {
    public static void main(String[] args) {
        String m = "dec";
        switch (m) {
            case "jan":
                System.out.println("1st Month");
                break;
            case "feb":
                System.out.println("2nd Month");
                break;
            case "mar":
                System.out.println("3rd Month");
                break;
            default:
                System.out.println("This is default");
                break;
        }
    }
}
