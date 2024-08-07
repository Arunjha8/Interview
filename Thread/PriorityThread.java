package Thread;

public class PriorityThread extends Thread {

    public PriorityThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " " + getPriority() + " " + i);
        }
    }

    public static void main(String[] args) {
        PriorityThread p1 = new PriorityThread("Arun");
        PriorityThread p2 = new PriorityThread("Amisha");
        PriorityThread p3 = new PriorityThread("Mahak");

        // Set thread priorities
//        p1.setPriority(1);      //set lowest priority
//        p2.setPriority(10);     //set highest priority
        p1.setPriority(Thread.MIN_PRIORITY);
        p2.setPriority(Thread.MAX_PRIORITY);


        p1.start();
        p2.start();
        p3.start();
    }
}
