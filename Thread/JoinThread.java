package Thread;

public class JoinThread extends Thread {
    public JoinThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " " + i);
        }
//        System.out.println(getName());

        try {
            sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JoinThread j1 = new JoinThread("Arun");
        JoinThread j2 = new JoinThread("Amisha");
        JoinThread j3 = new JoinThread("Mahak");

        j1.setName("Thread 1");
        j2.setName("Thread 2");
        j3.setName("Thread 3");

        j2.start();   // Start j2 first

        try {
            j2.join();   // Wait for j2 to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        j1.start();  // Start j1 after j2 completes
        j3.start();
    }
}
