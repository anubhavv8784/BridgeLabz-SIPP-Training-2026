import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unit Converter");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.println("5. Yards to Feet");
        System.out.println("6. Feet to Yards");
        System.out.println("7. Meters to Inches");
        System.out.println("8. Inches to Meters");
        System.out.println("9. Inches to Centimeters");
        System.out.println("10. Fahrenheit to Celsius");
        System.out.println("11. Celsius to Fahrenheit");
        System.out.println("12. Pounds to Kilograms");
        System.out.println("13. Kilograms to Pounds");
        System.out.println("14. Gallons to Liters");
        System.out.println("15. Liters to Gallons");
        System.out.print("Choose conversion option: ");
        int option = scanner.nextInt();
        System.out.print("Enter value: ");
        double value = scanner.nextDouble();
        scanner.close();

        double result;
        switch (option) {
            case 1:
                result = convertKmToMiles(value);
                System.out.printf("%.4f kilometers = %.4f miles\n", value, result);
                break;
            case 2:
                result = convertMilesToKm(value);
                System.out.printf("%.4f miles = %.4f kilometers\n", value, result);
                break;
            case 3:
                result = convertMetersToFeet(value);
                System.out.printf("%.4f meters = %.4f feet\n", value, result);
                break;
            case 4:
                result = convertFeetToMeters(value);
                System.out.printf("%.4f feet = %.4f meters\n", value, result);
                break;
            case 5:
                result = convertYardsToFeet(value);
                System.out.printf("%.4f yards = %.4f feet\n", value, result);
                break;
            case 6:
                result = convertFeetToYards(value);
                System.out.printf("%.4f feet = %.4f yards\n", value, result);
                break;
            case 7:
                result = convertMetersToInches(value);
                System.out.printf("%.4f meters = %.4f inches\n", value, result);
                break;
            case 8:
                result = convertInchesToMeters(value);
                System.out.printf("%.4f inches = %.4f meters\n", value, result);
                break;
            case 9:
                result = convertInchesToCentimeters(value);
                System.out.printf("%.4f inches = %.4f centimeters\n", value, result);
                break;
            case 10:
                result = convertFahrenheitToCelsius(value);
                System.out.printf("%.4f Fahrenheit = %.4f Celsius\n", value, result);
                break;
            case 11:
                result = convertCelsiusToFahrenheit(value);
                System.out.printf("%.4f Celsius = %.4f Fahrenheit\n", value, result);
                break;
            case 12:
                result = convertPoundsToKilograms(value);
                System.out.printf("%.4f pounds = %.4f kilograms\n", value, result);
                break;
            case 13:
                result = convertKilogramsToPounds(value);
                System.out.printf("%.4f kilograms = %.4f pounds\n", value, result);
                break;
            case 14:
                result = convertGallonsToLiters(value);
                System.out.printf("%.4f gallons = %.4f liters\n", value, result);
                break;
            case 15:
                result = convertLitersToGallons(value);
                System.out.printf("%.4f liters = %.4f gallons\n", value, result);
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }

    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
}
