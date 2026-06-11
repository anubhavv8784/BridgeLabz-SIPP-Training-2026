import java.util.Arrays;
import java.util.Scanner;

public class FactorsDynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int capacity = 10;
        int[] factors = new int[capacity];
        int size = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (size == capacity) {
                    capacity *= 2;
                    factors = Arrays.copyOf(factors, capacity);
                }
                factors[size++] = i;
            }
        }

        System.out.println("Factors:");
        for (int i = 0; i < size; i++) System.out.print(factors[i] + " ");
        System.out.println();
        sc.close();
    }
}
