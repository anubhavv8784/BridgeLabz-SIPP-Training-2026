import java.util.Scanner;

public class LargestAndSecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();

        int largest = -1, second = -1;
        for (char c : num.toCharArray()) {
            if (!Character.isDigit(c)) continue;
            int d = c - '0';
            if (d > largest) {
                second = largest;
                largest = d;
            } else if (d > second && d != largest) {
                second = d;
            }
        }

        System.out.println("Largest digit: " + (largest >= 0 ? largest : "N/A"));
        System.out.println("Second largest digit: " + (second >= 0 ? second : "N/A"));
        sc.close();
    }
}
