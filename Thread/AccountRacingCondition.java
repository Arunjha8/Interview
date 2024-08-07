package Thread;

public class AccountRacingCondition extends Thread {
    // create single static copy of Account
    public static Account account = new Account();

    public AccountRacingCondition(String name) {
        super(name);
    }

    //Deposit 3 time 1000, Total 5000
    public void run() {
        for (int i = 1; i <= 3; i++) {
            account.deposit(getName(), 1000);
        }
    }

    public static void main(String[] args) {
        AccountRacingCondition r1 = new AccountRacingCondition("Arun");
        AccountRacingCondition r2 = new AccountRacingCondition("Yugal");

        r1.start();
        r2.start();
    }
}
