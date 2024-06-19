package Basic;

public class SwappingWithVariable {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping : a = " + a + ", b = " + b);

        //without variable
//        a = a + b;
//        b = a - b;
//        a = a - b;

        //with variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("after swapping : a = " + a + ", b = " + b);

    }
}
