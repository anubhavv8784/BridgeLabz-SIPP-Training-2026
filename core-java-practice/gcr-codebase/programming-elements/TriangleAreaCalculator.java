import java.util.Scanner;

// TriangleAreaCalculator computes the area of a triangle in square centimeters
// and square inches from base and height values provided in centimeters.
public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read base and height values in centimeters from the user
        System.out.print("Enter the base of the triangle in cm: ");
        double baseInCentimeters = input.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double heightInCentimeters = input.nextDouble();

        // Compute the area in square centimeters
        double areaInSquareCentimeters = 0.5 * baseInCentimeters * heightInCentimeters;

        // Convert square centimeters to square inches
        double centimetersPerInch = 2.54;
        double areaInSquareInches = areaInSquareCentimeters / (centimetersPerInch * centimetersPerInch);

        // Display the results
        System.out.println("The area of the triangle in sq in is " + areaInSquareInches
                + " and sq cm is " + areaInSquareCentimeters);

        input.close();
    }
}
