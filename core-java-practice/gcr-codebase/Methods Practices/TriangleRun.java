import java.util.Scanner;

public class TriangleRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side 1 of the triangular park in meters: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side 2 of the triangular park in meters: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side 3 of the triangular park in meters: ");
        double side3 = scanner.nextDouble();
        scanner.close();

        double rounds = calculateRoundsFor5Km(side1, side2, side3);
        if (rounds <= 0) {
            System.out.println("Invalid triangle sides. The perimeter must be greater than zero.");
        } else {
            System.out.printf("To complete a 5 km run, the athlete must complete %.2f rounds around the park.\n", rounds);
        }
    }

    public static double calculateRoundsFor5Km(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        if (perimeter <= 0) {
            return 0;
        }
        double distanceInMeters = 5000.0;
        return distanceInMeters / perimeter;
    }
}
