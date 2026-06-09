// Creating Class with name MultiplicationTable to print multiplication table from 6 to 9
import java.util.Scanner;

class MultiplicationTable {
    
    public static void main(String[] args) {
        
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get integer input for number
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        
        // Use nested for loops to print multiplication table from 6 to 9
        for (int multiplier = 6; multiplier <= 9; multiplier++) {
            System.out.println("\nMultiplication table of " + number + " from " + multiplier + " to " + multiplier);
            
            // Print the multiplication at specific multiplier
            int product = number * multiplier;
            System.out.println(number + " * " + multiplier + " = " + product);
        }
        
        // Close the Scanner Stream
        input.close();
    }
}
