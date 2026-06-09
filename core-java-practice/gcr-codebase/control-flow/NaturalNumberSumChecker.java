// Creating Class with name NaturalNumberSumChecker to check if a number is natural and find sum
import java.util.Scanner;

class NaturalNumberSumChecker {
    
    public static void main(String[] args) {
        
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get integer input for number
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        
        // Check if the number is a positive integer (natural number)
        if (number > 0) {
            // Calculate sum of n natural numbers using formula: n * (n+1) / 2
            int sumOfNaturalNumbers = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sumOfNaturalNumbers);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        
        // Close the Scanner Stream
        input.close();
    }
}
