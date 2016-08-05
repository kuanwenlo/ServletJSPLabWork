/**
 * Created by kualo on 8/5/2016.
 */
public abstract class Account {
    private long balance;
    private String name;

    Account(String name) {
        this.name = name;
    }
    public final void showTransaction(String message, long amount) {
        System.out.println("Account name: " + name);
        System.out.println("Transaction message: " + message);
        System.out.println("Amount: " + amount);
        this.balance = balance + amount;
    }
    public long getBalance() {
        return balance;
    }
    public abstract boolean deposit(long amount);
    public abstract boolean withdraw(long amount);
}
