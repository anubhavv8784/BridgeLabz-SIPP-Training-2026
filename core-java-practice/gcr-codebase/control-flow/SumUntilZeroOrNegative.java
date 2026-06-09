// Creating Class with name SumUntilZeroOrNegative to find sum until user enters 0 or negative using break
import java.util.Scanner;

class SumUntilZeroOrNegative {
    
    public static void main(String[] args) {
        
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Create variable total initialized to 0.0 to store sum
        double total = 0.0;
        
        // Variable to store user input
        double userEntry;
        
        // Use infinite while loop and break statement to exit
        while (true) {
            System.out.println("Enter a number (0 or negative to stop): ");
            userEntry = input.nextDouble();
            
            // Break the loop if user enters 0 or negative number
            if (userEntry <= 0) {
                break;
            }
            
            // Add user entry to total
            total += userEntry;
        }
        
        // Display the total sum
        System.out.println("The sum of all positive numbers entered is: " + total);
        
        // Close the Scanner Stream
        input.close();
    }
}
