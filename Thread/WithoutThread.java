package Thread;

public class WithoutThread {
    String name = null;

    public WithoutThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " " + i);
        }
    }

    public static void main(String[] args) {
        WithoutThread t1=new WithoutThread("Arun");
        WithoutThread t2=new WithoutThread("Yugal");

        t1.run();
        t2.run();
    }
}
