public class Account {
    private static int lastAccountNumber = 1000;
    private int accountNumber = lastAccountNumber;
    private int agencyNumber;
    private double accountBalance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAgencyNumber(){
        return agencyNumber;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

//    private void generateAccountNumber() {
//        accountNumber++;
//    }

    public Account(double initialDeposit) {
        accountNumber++;
        agencyNumber = 1234;
        accountBalance = initialDeposit;
    }

    public void Deposit(double deposit) {
        accountBalance += deposit;
        System.out.printf("Your deposit of $%.2f was credited.\nYour current balance is $%.2f.\n", deposit, accountBalance);
    }

    public void Withdraw(double withdraw) {
        if (accountBalance < withdraw) {
            System.out.printf("Your withdraw of $%.2f was not allowed.\nYour current balance is $%.2f.\n", withdraw, accountBalance);
        } else {
            accountBalance -= withdraw;
            System.out.printf("Your withdraw of $%.2f was allowed.\nYour current balance is $%.2f.\n", withdraw, accountBalance);
        }

    }
}
