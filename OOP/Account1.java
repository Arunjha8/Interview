package OOP;

public class Account1 {
    public int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Total Balance = " + balance);
    }

    public void withdrawl(int amount) {
        if (balance - amount <= 2000) {
            System.err.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Total Balance = " + balance);
        }
    }
}
