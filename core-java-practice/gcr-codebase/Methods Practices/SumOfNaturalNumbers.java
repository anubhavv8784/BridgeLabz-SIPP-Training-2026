import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n to compute sum of first n natural numbers: ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = sumOfNaturalNumbers(n);
        System.out.printf("The sum of first %d natural numbers is %d\n", n, sum);
    }

    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
