import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    static void processPayment(double balance, double amount)
            throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException("Payment failed: Insufficient funds");
        }

        System.out.println("Payment successful");
    }

    public static void main(String[] args) {

        int[] patients = {101, 102, 103, 104, 105};

        try {
            int totalBill = 1000;
            int items = 0;

            double billPerItem = totalBill / items; // ArithmeticException
            System.out.println(billPerItem);

        } catch (ArithmeticException e) {
            System.out.println("Error: Number of items cannot be zero.");
        }

        try {
            int index = 10;
            System.out.println("Patient ID: " + patients[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        }

        try {
            String amount = "abc";
            int bill = Integer.parseInt(amount);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        }

        try {
            processPayment(5000, 8000);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}