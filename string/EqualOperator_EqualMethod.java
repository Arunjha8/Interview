package string;

public class EqualOperator_EqualMethod {
    public static void main(String[] args) {
        String s1 = "Neeraj";
        String s2 = "Neeraj";
        String s3 = "Rathore";

        String s4 = new String("Neeraj");
        String s5 = new String("Neeraj");
        String s6 = new String("Rathore");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s6);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s6));
    }
}
