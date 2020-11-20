package banking;

import java.util.LinkedHashMap;

/**
 * Private Variables:<br> {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {

    private LinkedHashMap<Long, Account> accounts;

    public Bank() {
        // complete the function
    }

    private Account getAccount(Long accountNumber) {
        return accounts.get(accountNumber);
    }

    @Override
    public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
        // complete the function
        return -1L;
    }

    public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
        // complete the function
        return -1L;
    }

    public boolean authenticateUser(Long accountNumber, int pin) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            boolean validatePin = account.validatePin(pin);
            return validatePin;
        }
        return false;
    }

    @Override
    public double getBalance(Long accountNumber) {
        return getAccount(accountNumber).getBalance();
    }

    @Override
    public void credit(Long accountNumber, double amount) {
        getAccount(accountNumber).creditAccount(amount);
    }

    @Override
    public boolean debit(Long accountNumber, double amount) {
        getAccount(accountNumber).creditAccount(amount);
        return true;
    }
}
