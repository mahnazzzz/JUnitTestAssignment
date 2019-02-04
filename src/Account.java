public class Account {

    String accountName ;
    double balance ;





    public Account( double balance, String accountName) {

        this.balance = balance;
        this.accountName = accountName;

    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
