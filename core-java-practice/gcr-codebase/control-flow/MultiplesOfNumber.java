// Creating Class with name MultiplesOfNumber to find all multiples of a number below 100
import java.util.Scanner;

class MultiplesOfNumber {
    
    public static void main(String[] args) {
        
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get integer input for number
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        
        // Check if number is positive integer and less than 100
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100");
        } else {
            // Display multiples header
            System.out.println("Multiples of " + number + " below 100 are: ");
            
            // Create counter variable initialized to number
            int counter = number;
            
            // Use while loop till counter is less than 100
            while (counter < 100) {
                // Print the multiple
                System.out.println(counter);
                
                // Add number to counter to get next multiple
                counter += number;
            }
        }
        
        // Close the Scanner Stream
        input.close();
    }
}
