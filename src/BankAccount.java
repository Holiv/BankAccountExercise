import java.util.Scanner;

public class BankAccount {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        User firstUser = new User("Helton", "Oliveira", 1000 );
        User secondtUser = new User("Laiz", "Alvarenga", 2000 );

        System.out.println("Type the user name to login: ");
        User currentUser = scanner.nextLine().contentEquals("firstUser") ? firstUser : secondtUser;
        int option;
        do {
            System.out.println("Select one of the options bellow");
            System.out.print("""
                    1 - Check Balance;
                    2 - Deposit;
                    3 - Withdraw;
                    4 - Show User Information;
                    5 - Create New User;
                    0 - Exit;
                    """);
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1 -> currentUser.getUserAccountBalance();
                case 2 -> currentUser.deposit();
                case 3 -> currentUser.withdraw();
                case 4 -> currentUser.showUserAccountInformation();
                case 5 -> createUser();
                default -> System.out.println("Select a valid option");
            }
        } while (option != 0);

        System.out.println("Thanks for being our client");
    }

    public static void createUser() {
        System.out.println("User First Name: ");
        String firstName = scanner.nextLine();
        System.out.println("User Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println("Your initial deposit: ");
        double initialDeposit = Double.parseDouble(scanner.nextLine());

        User newUser = new User(firstName, lastName, initialDeposit);

        System.out.println("New user was created");
        newUser.showUserAccountInformation();
    }
}
