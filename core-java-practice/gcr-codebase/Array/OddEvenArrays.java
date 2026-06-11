import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Error: not a natural number");
            sc.close();
            return;
        }

        int size = n / 2 + 1;
        int[] odd = new int[size];
        int[] even = new int[size];
        int oi = 0, ei = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) even[ei++] = i;
            else odd[oi++] = i;
        }

        System.out.println("Odd numbers:");
        for (int i = 0; i < oi; i++) System.out.print(odd[i] + " ");
        System.out.println();
        System.out.println("Even numbers:");
        for (int i = 0; i < ei; i++) System.out.print(even[i] + " ");
        System.out.println();
        sc.close();
    }
}
