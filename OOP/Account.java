package OOP;

public class Account {
    public double balance;

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(int amount) {
        balance = balance + amount;
        System.out.println("Total Deposit = " + amount);
        System.out.println("Total Balance = " + balance);
        return balance;
    }

    public void withdrawl(int amount) {
        System.out.println("Total Withdrawl = " + amount);
        balance = balance - amount;
        if (balance <= 2000) {
            System.err.println("Insufficient Balance");
        } else {
            System.out.println("Total Balance = " + balance);
        }
    }

    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(10000);
        a.withdrawl(7000);
    }
}
