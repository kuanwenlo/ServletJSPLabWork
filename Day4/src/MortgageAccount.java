/**
 * Created by kualo on 8/5/2016.
 */
public class MortgageAccount extends Account{

    private long amountBorrowed;

    public MortgageAccount(String name, long amountBorrowed) {
        super(name);
        this.amountBorrowed = amountBorrowed;
        super.showTransaction("Initial Borrowed Amount:", amountBorrowed);
    }

    @Override
    public boolean deposit(long amount) {
        super.showTransaction("MortgageAccount Payment", amount);
        return true;
    }

    @Override
    public boolean withdraw(long amount) {
        return false;
    }
}
