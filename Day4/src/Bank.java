/**
 * Created by kualo on 8/5/2016.
 */
public class Bank {


    public static void main(String[] args) {
        Account[] accounts = new Account[3];
        accounts[0] = new MortgageAccount("User1", 100000);
        accounts[1] = new CheckingAccount("User2", 200);
        accounts[2] = new CheckingAccount("User3", 1000);
        for (Account account : accounts) {
            System.out.println("Deposit 100: " + account.deposit(100));
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Withdraw 500: " + account.deposit(500));
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Withdraw 1000: " + account.deposit(1000));
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Withdraw 2000: " + account.deposit(2000));
            System.out.println("Balance: " + account.getBalance());
        }
    }


}
