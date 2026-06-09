// Creating Class with name LargestNumberChecker to check which of 3 numbers is largest
import java.util.Scanner;

class LargestNumberChecker {
    
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
        
        // Check if first number is the largest
        boolean isFirstLargest = (number1 > number2) && (number1 > number3);
        System.out.println("Is the first number the largest? " + isFirstLargest);
        
        // Check if second number is the largest
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        
        // Check if third number is the largest
        boolean isThirdLargest = (number3 > number1) && (number3 > number2);
        System.out.println("Is the third number the largest? " + isThirdLargest);
        
        // Close the Scanner Stream
        input.close();
    }
}
