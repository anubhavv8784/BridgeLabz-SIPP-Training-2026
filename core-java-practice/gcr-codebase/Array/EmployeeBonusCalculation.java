import java.util.Scanner;

public class EmployeeBonusCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 10;
        double[] salary = new double[N];
        double[] bonus = new double[N];
        double[] newSalary = new double[N];

        double totalOld = 0, totalBonus = 0, totalNew = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();
            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            int years = sc.nextInt();

            if (years > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];

            totalOld += salary[i];
            totalBonus += bonus[i];
            totalNew += newSalary[i];
        }

        System.out.println("\nOldSalary\tBonus\tNewSalary");
        for (int i = 0; i < N; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\n", salary[i], bonus[i], newSalary[i]);
        }

        System.out.println();
        System.out.printf("Total old salary: %.2f\n", totalOld);
        System.out.printf("Total bonus: %.2f\n", totalBonus);
        System.out.printf("Total new salary: %.2f\n", totalNew);
        sc.close();
    }
}
