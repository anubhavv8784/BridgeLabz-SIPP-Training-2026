// Creating Class with name FizzBuzzWhile to print FizzBuzz pattern using while loop
import java.util.Scanner;

class FizzBuzzWhile {
    
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
            
            // Use while loop to iterate from 1 to number
            while (counter <= number) {
                // Check for multiples of both 3 and 5
                if (counter % 3 == 0 && counter % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check for multiples of 3
                else if (counter % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check for multiples of 5
                else if (counter % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Print the number if not multiple of 3 or 5
                else {
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
