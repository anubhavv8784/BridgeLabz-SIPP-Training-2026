class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(double balance, double amount) {
        super("Insufficient Balance! Available: ₹" + balance +
              ", Requested: ₹" + amount);
    }
}

class Account {
    double balance = 5000;

    void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }

        balance -= amount;
        System.out.println("Withdrawal Successful");
    }
}

public class ATMSystem {

    public static void main(String[] args) {

        Account acc = new Account();

        try {
            acc.withdraw(8000);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}