// Creating Class with name NaturalNumberSumForLoop to compare for loop and formula for sum
import java.util.Scanner;

class NaturalNumberSumForLoop {
    
    public static void main(String[] args) {
        
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get user input for number
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        
        // Check if number is a natural number
        if (number <= 0) {
            System.out.println("The number " + number + " is not a natural number");
        } else {
            // Calculate sum using formula: n * (n+1) / 2
            int sumUsingFormula = number * (number + 1) / 2;
            
            // Calculate sum using for loop
            int sumUsingLoop = 0;
            for (int counter = 1; counter <= number; counter++) {
                sumUsingLoop += counter;
            }
            
            // Display both results
            System.out.println("Sum using formula: " + sumUsingFormula);
            System.out.println("Sum using for loop: " + sumUsingLoop);
            
            // Compare and verify both computations are correct
            if (sumUsingFormula == sumUsingLoop) {
                System.out.println("Both computations match. Result is correct!");
            } else {
                System.out.println("Results do not match. There is an error!");
            }
        }
        
        // Close the Scanner Stream
        input.close();
    }
}
