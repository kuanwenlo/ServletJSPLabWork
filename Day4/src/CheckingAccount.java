/**
 * Created by kualo on 8/5/2016.
 */
public class CheckingAccount extends Account{
    private long overdraftAmount;
    public CheckingAccount(String name, long overdraftAmount) {
        super(name);
        this.overdraftAmount = overdraftAmount;
    }
    @Override
    public boolean deposit(long amount) {
        super.showTransaction("Checking Deposit", amount);
        return true;
    }

    @Override
    public boolean withdraw(long amount) {
        if ((super.getBalance() - amount) > overdraftAmount) {
            super.showTransaction("Checking Withdraw", amount * (-1));
            return true;
        }
        return false;
    }
}
