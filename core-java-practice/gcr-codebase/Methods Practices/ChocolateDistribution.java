import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = scanner.nextInt();
        System.out.print("Enter number of children: ");
        int children = scanner.nextInt();
        scanner.close();

        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.printf("Each child gets %d chocolates and %d chocolates remain.\n", result[1], result[0]);
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Number of children cannot be zero.");
        }
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{remainder, quotient};
    }
}
