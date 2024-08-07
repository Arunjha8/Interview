package Thread;

public class ByRunnable implements Runnable {
    String name = null;

    public ByRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " " + i);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ByRunnable("Arun"));
        Thread t2 = new Thread(new ByRunnable("Yugal"));

        t1.start();
        t2.start();
    }
}
