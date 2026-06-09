import java.util.Scanner;

// KilometerToMilesConverterUserInput converts distance in kilometers to miles using user input
public class KilometerToMilesConverterUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometerDistance = input.nextDouble();

        double conversionFactor = 1.6;
        double milesDistance = kilometerDistance / conversionFactor;

        System.out.println("The total miles is " + milesDistance + " mile for the given " + kilometerDistance + " km");

        input.close();
    }
}
