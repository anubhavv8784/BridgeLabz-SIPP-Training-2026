// Creating Class with name GreatestFactor to find greatest factor using for loop
import java.util.Scanner;

class GreatestFactor {
    
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
            
            // Create for loop that runs from number - 1 down to 1
            for (int i = number - 1; i >= 1; i--) {
                // Check if number is perfectly divisible by i
                if (number % i == 0) {
                    // Assign i to greatestFactor and break the loop
                    greatestFactor = i;
                    break;
                }
            }
            
            // Display the greatest factor
            System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
        }
        
        // Close the Scanner Stream
        input.close();
    }
}
