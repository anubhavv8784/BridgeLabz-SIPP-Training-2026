import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Error: not a positive integer");
            sc.close();
            return;
        }

        String[] res = new String[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i % 15 == 0 && i != 0) res[i] = "FizzBuzz";
            else if (i % 3 == 0 && i != 0) res[i] = "Fizz";
            else if (i % 5 == 0 && i != 0) res[i] = "Buzz";
            else res[i] = String.valueOf(i);
        }

        for (int i = 0; i <= n; i++) System.out.println("Position " + i + " = " + res[i]);
        sc.close();
    }
}
