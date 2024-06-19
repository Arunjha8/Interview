package OOP;

public class MethodOverloading {
    public void move(int i) {
        System.out.println("First Number = " + i);
    }

    public void move(int i, int j) {
        System.out.println("Second Number = " + (i + j));
    }

    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        m.move(10);
        m.move(10, 20);
    }
}
