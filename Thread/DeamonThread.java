package Thread;

public class DeamonThread extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
                System.out.println("Deamon Thread");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        DeamonThread d = new DeamonThread();
        d.setDaemon(true);
        d.start();
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Main Thread = " + i);
        }
        System.out.println("Leaving Main Thread");
    }
}
