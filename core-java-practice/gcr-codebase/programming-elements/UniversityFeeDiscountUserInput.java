import java.util.Scanner;

// UniversityFeeDiscountUserInput calculates discounted fee based on user input
public class UniversityFeeDiscountUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the course fee in INR: ");
        double fee = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        double discountAmount = (discountPercent / 100.0) * fee;
        double finalDiscountedFee = fee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalDiscountedFee);

        input.close();
    }
}
