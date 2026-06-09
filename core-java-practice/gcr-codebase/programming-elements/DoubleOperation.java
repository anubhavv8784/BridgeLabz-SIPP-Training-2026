import java.util.Scanner;

// DoubleOperation reads three double values and computes the same expressions.
public class DoubleOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter double value a: ");
        double a = input.nextDouble();

        System.out.print("Enter double value b: ");
        double b = input.nextDouble();

        System.out.print("Enter double value c: ");
        double c = input.nextDouble();

        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = b != 0 ? c + a / b : Double.NaN;
        double result4 = b != 0 ? a % b + c : Double.NaN;

        if (b == 0) {
            System.out.println("Cannot perform a / b or a % b when b is zero.");
        }

        System.out.println("The results of Double Operations are "
                + result1 + ", "
                + result2 + ", "
                + result3 + ", and "
                + result4);

        input.close();
    }
}
