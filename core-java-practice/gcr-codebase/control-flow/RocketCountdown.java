// Creating Class with name RocketCountdown to perform countdown for rocket launch using while loop
import java.util.Scanner;

class RocketCountdown {
    
    public static void main(String[] args) {
        
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get user input for countdown value
        System.out.println("Enter the countdown value: ");
        int counter = input.nextInt();
        
        // Check if counter is positive
        if (counter <= 0) {
            System.out.println("Please enter a positive number");
        } else {
            // Use while loop to perform countdown
            while (counter >= 1) {
                System.out.println(counter);
                counter--;
            }
            System.out.println("Blastoff!");
        }
        
        // Close the Scanner Stream
        input.close();
    }
}
