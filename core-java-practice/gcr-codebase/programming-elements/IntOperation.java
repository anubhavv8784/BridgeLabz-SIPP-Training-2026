import java.util.Scanner;

// IntOperation reads three integers and computes several expressions.
public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer a: ");
        int a = input.nextInt();

        System.out.print("Enter integer b: ");
        int b = input.nextInt();

        System.out.print("Enter integer c: ");
        int c = input.nextInt();

        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = b != 0 ? c + a / b : Integer.MIN_VALUE;
        int result4 = b != 0 ? a % b + c : Integer.MIN_VALUE;

        if (b == 0) {
            System.out.println("Cannot perform a / b or a % b when b is zero.");
        }

        System.out.println("The results of Int Operations are "
                + result1 + ", "
                + result2 + ", "
                + (b != 0 ? result3 : "undefined") + ", and "
                + (b != 0 ? result4 : "undefined"));

        input.close();
    }
}
