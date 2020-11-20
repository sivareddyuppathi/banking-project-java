package banking;

import java.util.ArrayList;
import java.util.List;

/**
 * Account implementation for commercial (business) customers.<br><br>
 *
 * Private Variables:<br> {@link #authorizedUsers}: List&lt;Person&gt;<br>
 */
public class CommercialAccount {

    private List<Person> authorizedUsers;

    public CommercialAccount(Company company, Long accountNumber, int pin, double startingDeposit) {
        // complete the function
    }

    /**
     * @param person The authorized user to add to the account.
     */
    protected void addAuthorizedUser(Person person) {
        Person person1 = new Person(person.getFirstName(), person.getLastName(), 1);
    }

    /**
     * @param person
     * @return true if person matches an authorized user in
     * {@link #authorizedUsers}; otherwise, false.
     */
    public boolean isAuthorizedUser(Person person) {
        boolean contains = authorizedUsers.contains(person);
        return contains;
    }
}
