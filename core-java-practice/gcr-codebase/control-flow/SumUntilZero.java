// Creating Class with name SumUntilZero to find sum of numbers until user enters 0
import java.util.Scanner;

class SumUntilZero {
    
    public static void main(String[] args) {
        
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Create variable total initialized to 0.0 to store sum
        double total = 0.0;
        
        // Variable to store user input
        double userEntry;
        
        // Use while loop to add numbers until user enters 0
        while (true) {
            System.out.println("Enter a number (0 to stop): ");
            userEntry = input.nextDouble();
            
            // Check if user entered 0
            if (userEntry == 0) {
                break;
            }
            
            // Add user entry to total
            total += userEntry;
        }
        
        // Display the total sum
        System.out.println("The sum of all numbers entered is: " + total);
        
        // Close the Scanner Stream
        input.close();
    }
}
