package AccountAndOwner;

import java.util.Optional;


public class Main {

    public static void process(Account account) {
        try {
            final Optional<User> owner = Optional.ofNullable(account.getOwner());

            System.out.println(account.getCode());
            System.out.println(account.getBalance());

            owner.ifPresent(o -> {
                System.out.println(o.getLogin());
                System.out.println(o.getFirstName());
                System.out.println(o.getLastName());
            });

        } catch (Exception e) {
            System.out.println("Something wrong...");
        }
    }


    public static void main(String[] args) {

        /*
        Account and its owner
        There are two classes: Account with three fields (code, balance, owner) and User with three fields (login, firstName,
        lastName). Both classes have parameterized constructors. See the full declarations of these classes in the code
        template. Do not be afraid of the static keyword. It's not important now.

        In the main method, create an instance of the Account class and pass it to the process method by calling process
        (account). This method is already defined.

        The instance must have the following values of the fields:
          • code: "123456",
          • balance: 1000,
          • owner: (login: "demo-user", firstName: "Alexander", lastName: "Schmidt").
        Note that the owner is an instance of the User class.
        See the provided template, do not change it.
         */
        // create an instance of Account here
        User owner = new User("demo-user", "Alexander", "Schmidt");
        Account account = new Account("123456", 1000, owner );

        // pass it into process method
        process(account);
    }
}
