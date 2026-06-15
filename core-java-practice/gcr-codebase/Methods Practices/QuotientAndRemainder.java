import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();
        scanner.close();

        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.printf("Quotient = %d, Remainder = %d\n", result[1], result[0]);
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{remainder, quotient};
    }
}
