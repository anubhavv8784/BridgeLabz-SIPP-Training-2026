// Creating Class with name FactorialCalculator to find factorial using while loop
import java.util.Scanner;

class FactorialCalculator {
    
    public static void main(String[] args) {
        
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get integer input for number
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        
        // Check if user entered a positive integer
        if (number < 0) {
            System.out.println("Please enter a positive integer");
        } else if (number == 0 || number == 1) {
            System.out.println("The factorial of " + number + " is 1");
        } else {
            // Calculate factorial using while loop
            int factorial = 1;
            int counter = number;
            
            while (counter > 1) {
                factorial = factorial * counter;
                counter--;
            }
            
            // Print the factorial result
            System.out.println("The factorial of " + number + " is " + factorial);
        }
        
        // Close the Scanner Stream
        input.close();
    }
}
