// Creating Class with name NumberChecker to check if number is positive, negative, or zero
import java.util.Scanner;

class NumberChecker {
    
    public static void main(String[] args) {
        
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get integer input for number
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        
        // Check if number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
        
        // Close the Scanner Stream
        input.close();
    }
}
