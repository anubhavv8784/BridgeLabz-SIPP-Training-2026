import java.util.Arrays;
import java.util.Scanner;

public class DynamicArrayLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();

        int capacity = 5;
        int[] digits = new int[capacity];
        int size = 0;

        for (char c : num.toCharArray()) {
            if (!Character.isDigit(c)) continue;
            if (size == digits.length) {
                digits = Arrays.copyOf(digits, digits.length + 10);
            }
            digits[size++] = c - '0';
        }

        int largest = -1, second = -1;
        for (int i = 0; i < size; i++) {
            int d = digits[i];
            if (d > largest) {
                second = largest;
                largest = d;
            } else if (d > second && d != largest) {
                second = d;
            }
        }

        System.out.println("Digits stored: " + size);
        System.out.println("Largest digit: " + (largest >= 0 ? largest : "N/A"));
        System.out.println("Second largest digit: " + (second >= 0 ? second : "N/A"));
        sc.close();
    }
}
