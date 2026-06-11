import java.util.Scanner;

public class PosNegZeroFiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) arr[i] = sc.nextInt();

        for (int v : arr) {
            if (v > 0) {
                System.out.print(v + " is positive and ");
                System.out.println((v % 2 == 0) ? "even." : "odd.");
            } else if (v < 0) System.out.println(v + " is negative.");
            else System.out.println(v + " is zero.");
        }

        int first = arr[0], last = arr[4];
        if (first == last) System.out.println("First and last elements are equal.");
        else if (first > last) System.out.println("First element is greater than last element.");
        else System.out.println("First element is less than last element.");
        sc.close();
    }
}
