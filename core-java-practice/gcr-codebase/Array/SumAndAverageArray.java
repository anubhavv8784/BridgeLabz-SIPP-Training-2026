import java.util.Scanner;

public class SumAndAverageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        double avg = n > 0 ? sum / n : 0;
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + avg);
        sc.close();
    }
}
