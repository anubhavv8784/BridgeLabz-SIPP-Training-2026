// Creating Class with name SmallestNumberChecker to check if first is smallest of 3 numbers
import java.util.Scanner;

class SmallestNumberChecker {
    
    public static void main(String[] args) {
        
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input for three numbers
        System.out.println("Enter first number: ");
        int number1 = input.nextInt();
        
        System.out.println("Enter second number: ");
        int number2 = input.nextInt();
        
        System.out.println("Enter third number: ");
        int number3 = input.nextInt();
        
        // Check if the first number is the smallest
        boolean isSmallest = (number1 < number2) && (number1 < number3);
        
        System.out.println("Is the first number the smallest? " + isSmallest);
        
        // Close the Scanner Stream
        input.close();
    }
}
