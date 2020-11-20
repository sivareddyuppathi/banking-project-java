package banking;

/**
 * Abstract bank account class.<br>
 * <br>
 *
 * Private Variables:<br> {@link #accountHolder}: AccountHolder<br>
 * {@link #accountNumber}: Long<br> {@link #pin}: int<br> {@link #balance}:
 * double
 */
public abstract class Account {
    
    private AccountHolder accountHolder;
    private Long accountNumber;
    private int pin;
    private double balance;
    
    protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.pin = pin;
    }
    
    public AccountHolder getAccountHolder() {
        return new AccountHolder(pin) {};
    }
    
    public boolean validatePin(int attemptedPin) {
        return attemptedPin == pin;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public Long getAccountNumber() {
        return accountNumber;
    }
    
    public void creditAccount(double amount) {
        balance += amount;
    }
    
    public boolean debitAccount(double amount) {
        balance -= amount;
        return true;
    }
}
