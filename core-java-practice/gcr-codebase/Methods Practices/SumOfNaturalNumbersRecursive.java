import java.util.Scanner;

public class SumOfNaturalNumbersRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
            return;
        }

        long recursiveSum = recursiveSum(n);
        long formulaSum = formulaSum(n);

        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Results match: " + (recursiveSum == formulaSum));
    }

    public static long recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

    public static long formulaSum(int n) {
        return (long) n * (n + 1) / 2;
    }
}
