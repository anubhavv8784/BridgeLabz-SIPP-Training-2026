// Creating Class with name PowerOfNumber to find the power of a number using for loop
import java.util.Scanner;

class PowerOfNumber {
    
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
            
            // Use for loop from i = 1 to power
            for (int i = 1; i <= power; i++) {
                // Multiply result by number
                result = result * number;
            }
            
            // Display the result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }
        
        // Close the Scanner Stream
        input.close();
    }
}
