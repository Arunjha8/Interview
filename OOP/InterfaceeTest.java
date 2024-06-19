package OOP;

public class InterfaceeTest implements Interfacee {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        InterfaceeTest i = new InterfaceeTest();
        int z = i.add(10, 20);
        System.out.println(z);
    }
}
