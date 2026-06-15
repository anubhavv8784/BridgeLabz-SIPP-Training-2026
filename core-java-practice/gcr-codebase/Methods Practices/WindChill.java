import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature (degrees Fahrenheit): ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter wind speed (miles per hour): ");
        double windSpeed = scanner.nextDouble();
        scanner.close();

        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.printf("The wind chill temperature is %.2f degrees Fahrenheit.\n", windChill);
    }

    public static double calculateWindChill(double temperature, double windSpeed) {
        if (windSpeed < 0) {
            throw new IllegalArgumentException("Wind speed cannot be negative.");
        }
        return 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16)
                + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
    }
}
