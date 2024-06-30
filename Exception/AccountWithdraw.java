package Exception;

public class AccountWithdraw {
    public int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public int withdrawl(int amount) throws WithdrawException {
        if (balance - amount < 2000) {
            WithdrawException e = new WithdrawException("Amount is less than 2000...");
            throw e;
        } else {
            balance = balance - amount;
        }
        return balance;
    }

    public static void main(String[] args) {
        AccountWithdraw a = new AccountWithdraw();
        a.setBalance(5000);
        try {
            a.withdrawl(4000);
            System.out.println(a.getBalance());
        } catch (WithdrawException e) {
            System.out.println(e.getMessage());
        }
    }
}
