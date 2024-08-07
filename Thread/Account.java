package Thread;

public class Account {
    private int balance;

    public int getBalance() {
        delay();
        return balance;
    }

    public void setBalance(int balance) {
        delay();
        this.balance = balance;
    }

    // sorting order m amount lana ho to
    //method synchronized
//    public synchronized void deposit(String msg, int amount) {
    public void deposit(String msg, int amount) {
        //block synchronized
//        synchronized (this) {
        int bal = getBalance() + amount;
        setBalance(bal);
        System.out.println(msg + " - new Balance =  " + bal);
//        }
    }

    public void delay() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
