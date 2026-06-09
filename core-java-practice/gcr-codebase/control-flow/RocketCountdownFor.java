// Creating Class with name RocketCountdownFor to perform countdown for rocket launch using for loop
import java.util.Scanner;

class RocketCountdownFor {
    
    public static void main(String[] args) {
        
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get user input for countdown value
        System.out.println("Enter the countdown value: ");
        int countdownValue = input.nextInt();
        
        // Check if countdown value is positive
        if (countdownValue <= 0) {
            System.out.println("Please enter a positive number");
        } else {
            // Use for loop to perform countdown from user input to 1
            for (int counter = countdownValue; counter >= 1; counter--) {
                System.out.println(counter);
            }
            System.out.println("Blastoff!");
        }
        
        // Close the Scanner Stream
        input.close();
    }
}
