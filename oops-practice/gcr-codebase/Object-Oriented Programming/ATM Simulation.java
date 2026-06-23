class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    BankAccount(String accountHolder,
                int accountNumber,
                double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    void displayBalance() {
        System.out.println("Balance = " + balance);
    }

    public static void main(String[] args) {
        BankAccount b =
                new BankAccount("Anubhav", 12345, 10000);

        b.deposit(5000);
        b.withdraw(2000);
        b.displayBalance();
    }
}