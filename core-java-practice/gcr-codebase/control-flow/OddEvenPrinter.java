// Creating Class with name OddEvenPrinter to print odd and even numbers from 1 to n
import java.util.Scanner;

class OddEvenPrinter {
    
    public static void main(String[] args) {
        
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get integer input for number
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        
        // Check if number is a natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number");
        } else {
            // Use for loop to iterate from 1 to number
            for (int counter = 1; counter <= number; counter++) {
                // Check if number is odd or even
                if (counter % 2 == 0) {
                    System.out.println(counter + " is an even number");
                } else {
                    System.out.println(counter + " is an odd number");
                }
            }
        }
        
        // Close the Scanner Stream
        input.close();
    }
}
