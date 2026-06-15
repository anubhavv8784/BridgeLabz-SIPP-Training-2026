import java.util.Scanner;

public class DistanceAndLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        scanner.close();

        double distance = euclideanDistance(x1, y1, x2, y2);
        String lineEquation = lineEquation(x1, y1, x2, y2);

        System.out.printf("Euclidean distance = %.4f\n", distance);
        System.out.println("Equation of line: " + lineEquation);
    }

    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static String lineEquation(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {
            return "x = " + x1;
        }
        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return String.format("y = %.4fx + %.4f", slope, intercept);
    }
}
