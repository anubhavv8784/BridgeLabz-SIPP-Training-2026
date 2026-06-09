// Creating Class with name PowerOfNumberWhile to find the power of a number using while loop
import java.util.Scanner;

class PowerOfNumberWhile {
    
    public static void main(String[] args) {
        
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get integer input for number
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        
        // Get integer input for power
        System.out.println("Enter the power: ");
        int power = input.nextInt();
        
        // Check if both inputs are positive integers
        if (number <= 0 || power < 0) {
            System.out.println("Please enter positive integers for number and non-negative for power");
        } else {
            // Create result variable with initial value of 1
            int result = 1;
            
            // Create temp variable counter and initialize to 0
            int counter = 0;
            
            // Use while loop till counter == power
            while (counter < power) {
                // Multiply result by number and assign to result
                result = result * number;
                
                // Increment counter
                counter++;
            }
            
            // Display the result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }
        
        // Close the Scanner Stream
        input.close();
    }
}
