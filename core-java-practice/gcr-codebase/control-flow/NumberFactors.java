// Creating Class with name NumberFactors to find all factors of a number using while loop
import java.util.Scanner;

class NumberFactors {
    
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
            // Create counter variable initialized to 1
            int counter = 1;
            
            // Display factors header
            System.out.println("Factors of " + number + " are: ");
            
            // Use while loop to check each number from 1 to number
            while (counter <= number) {
                // Check if counter perfectly divides the number
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                
                // Increment counter
                counter++;
            }
        }
        
        // Close the Scanner Stream
        input.close();
    }
}
