import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();

        int n = num.length();
        char[] digits = new char[n];
        for (int i = 0; i < n; i++) digits[i] = num.charAt(i);

        StringBuilder rev = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) rev.append(digits[i]);

        System.out.println("Reversed number: " + rev.toString());
        sc.close();
    }
}
