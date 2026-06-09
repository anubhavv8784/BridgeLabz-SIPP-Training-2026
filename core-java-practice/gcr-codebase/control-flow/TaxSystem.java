import java.util.Scanner;

public class TaxSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalTax = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter income: ");
            double income = sc.nextDouble();

            double tax;

            if (income < 10000) {
                tax = income * 0.05;
                System.out.println("Bracket: 5%");
            } else if (income <= 50000) {
                tax = income * 0.15;
                System.out.println("Bracket: 15%");
            } else {
                tax = income * 0.30;
                System.out.println("Bracket: 30%");
            }

            System.out.println("Tax = " + tax);
            totalTax += tax;
        }

        System.out.println("Total Tax Collected = " + totalTax);

        sc.close();
    }
}
