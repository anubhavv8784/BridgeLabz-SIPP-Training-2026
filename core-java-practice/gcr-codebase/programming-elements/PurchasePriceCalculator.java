import java.util.Scanner;

// PurchasePriceCalculator computes the total price for a product purchase.
public class PurchasePriceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the unit price in INR: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter the quantity to be bought: ");
        int quantity = input.nextInt();

        // Compute the total purchase price
        double totalPurchasePrice = unitPrice * quantity;

        // Display the total price
        System.out.println("The total purchase price is INR " + totalPurchasePrice
                + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        input.close();
    }
}
