import java.util.Scanner;

// HeightConverter converts height in centimeters to feet and inches
public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double heightInCentimeters = input.nextDouble();

        double centimetersPerInch = 2.54;
        double centimetersPerFoot = 12 * centimetersPerInch;

        double heightInFeet = heightInCentimeters / centimetersPerFoot;
        double remainingCentimeters = heightInCentimeters % centimetersPerFoot;
        double heightInInches = remainingCentimeters / centimetersPerInch;

        System.out.println("Your Height in cm is " + heightInCentimeters + " while in feet is " + heightInFeet + " and inches is " + heightInInches);

        input.close();
    }
}
