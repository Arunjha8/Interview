package Exception;

public class Account {
    public int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdrawl(int amount) throws Exception {
        if (balance - amount < 2000) {
            throw new Exception("Insufficent Balance");
        }
    }

    public static void main(String[] args) {
        Account a = new Account();
        a.setBalance(5000);
        try {
            a.withdrawl(4000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
