package Thread;

public class WithThread extends Thread {
    String name = null;

    public WithThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " " + i);
        }
    }

    public static void main(String[] args) {
        WithThread t1 = new WithThread("Arun");
        WithThread t2 = new WithThread("Yugal");

        t1.start();
        t2.start();
    }
}
