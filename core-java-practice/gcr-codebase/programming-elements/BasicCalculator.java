import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();
        double additionResult = number1 + number2;
        double subtractionResult = number1 - number2;
        double multiplicationResult = number1 * number2;
        double divisionResult = number2 != 0 ? number1 / number2 : Double.NaN;
        System.out.println("The addition, subtraction, multiplication, and division values of "
                + number1 + " and " + number2 + " are "
                + additionResult + ", "
                + subtractionResult + ", "
                + multiplicationResult + ", and "
                + divisionResult);

        input.close();
    }
}
