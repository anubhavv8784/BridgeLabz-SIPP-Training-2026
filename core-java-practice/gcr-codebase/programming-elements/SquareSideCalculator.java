import java.util.Scanner;

// SquareSideCalculator calculates the side length of a square from its perimeter.
public class SquareSideCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Compute the side length from the perimeter
        double sideLength = perimeter / 4.0;

        // Display the results
        System.out.println("The length of the side is " + sideLength + " whose perimeter is " + perimeter);

        input.close();
    }
}
