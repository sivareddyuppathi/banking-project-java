package banking;

public class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        new AccountHolder(idNumber) {
        };
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
