// Creating Class with name GreatestFactorWhile to find greatest factor using while loop
import java.util.Scanner;

class GreatestFactorWhile {
    
    public static void main(String[] args) {
        
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get integer input for number
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        
        // Check if number is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
        } else {
            // Define greatestFactor variable initialized to 1
            int greatestFactor = 1;
            
            // Create counter variable and assign counter = number - 1
            int counter = number - 1;
            
            // Use while loop till counter is greater than or equal to 1
            while (counter >= 1) {
                // Check if number is perfectly divisible by counter
                if (number % counter == 0) {
                    // Assign counter to greatestFactor and break the loop
                    greatestFactor = counter;
                    break;
                }
                
                // Decrement counter
                counter--;
            }
            
            // Display the greatest factor
            System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
        }
        
        // Close the Scanner Stream
        input.close();
    }
}
