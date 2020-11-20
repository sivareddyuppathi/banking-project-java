package banking;

public class ConsumerAccount {

    private Person person;
    private Long accountNumber;
    private int pin;
    private double currentBalance;

    public ConsumerAccount(Person person, Long accountNumber, int pin, double currentBalance) {
        this.person = person;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.currentBalance = currentBalance;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

}
