public class User {
    private String firstName;
    private String lastName;
    private Account userAccount;
    public User(String firstName, String lastName, double initialDeposit) {
        this.firstName = firstName;
        this.lastName = lastName;
        userAccount = new Account(initialDeposit);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void getUserAccountBalance(){
        System.out.printf("Your current Balance is: $%.2f\n", userAccount.getAccountBalance());
    }

    public void withdraw(){
        System.out.print("How much do you want to withdraw: ");
        double withdraw = Double.parseDouble(BankAccount.scanner.nextLine());
        userAccount.Withdraw(withdraw);
    }

    public void deposit(){
        System.out.print("How much do you want to deposit: ");
        double deposit = Double.parseDouble(BankAccount.scanner.nextLine());
        userAccount.Deposit(deposit);
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public void showUserAccountInformation(){
        System.out.println("User name: " + getFullName() +
                "\nUser Agency: " + userAccount.getAgencyNumber() +
                "\nUser Account: " + userAccount.getAccountNumber() +
                "\nUser Current Balance $" + userAccount.getAccountBalance());
    }
}
