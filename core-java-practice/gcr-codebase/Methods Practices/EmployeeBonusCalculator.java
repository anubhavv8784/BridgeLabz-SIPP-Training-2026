import java.util.Random;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        double[] salaries = generateRandomSalaries(10, 30000, 100000);
        int[] yearsOfService = generateRandomYearsOfService(10, 1, 10);

        double totalBonus = 0;
        System.out.println("Employee \tOld Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < 10; i++) {
            double bonus = calculateBonus(salaries[i], yearsOfService[i]);
            double newSalary = salaries[i] + bonus;
            totalBonus += bonus;
            System.out.printf("%d\t%.2f\t%d\t%.2f\t%.2f\n", i + 1, salaries[i], yearsOfService[i], bonus, newSalary);
        }
        System.out.printf("Total bonus paid: %.2f\n", totalBonus);
    }

    public static double[] generateRandomSalaries(int count, int min, int max) {
        double[] salaries = new double[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            salaries[i] = min + random.nextDouble() * (max - min);
        }
        return salaries;
    }

    public static int[] generateRandomYearsOfService(int count, int min, int max) {
        int[] years = new int[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            years[i] = random.nextInt(max - min + 1) + min;
        }
        return years;
    }

    public static double calculateBonus(double salary, int yearsOfService) {
        double rate = yearsOfService > 5 ? 0.05 : 0.02;
        return salary * rate;
    }
}
