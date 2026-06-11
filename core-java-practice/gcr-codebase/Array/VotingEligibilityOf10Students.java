import java.util.Scanner;

public class VotingEligibilityOf10Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 10;
        int[] age = new int[N];

        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < N; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            age[i] = sc.nextInt();
        }

        System.out.println("\nEligible for voting:");
        for (int i = 0; i < N; i++) {
            if (age[i] >= 18) {
                System.out.println("Student " + (i + 1) + " (age " + age[i] + ") is eligible.");
            } else {
                System.out.println("Student " + (i + 1) + " (age " + age[i] + ") is NOT eligible.");
            }
        }
        sc.close();
    }
}
