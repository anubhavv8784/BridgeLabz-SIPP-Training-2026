// Creating Class with name FriendsComparison to find youngest and tallest among 3 friends
import java.util.Scanner;

class FriendsComparison {
    
    public static void main(String[] args) {
        
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get age and height for Amar
        System.out.println("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.println("Enter Amar's height: ");
        double amarHeight = input.nextDouble();
        
        // Get age and height for Akbar
        System.out.println("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.println("Enter Akbar's height: ");
        double akbarHeight = input.nextDouble();
        
        // Get age and height for Anthony
        System.out.println("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();
        System.out.println("Enter Anthony's height: ");
        double anthonyHeight = input.nextDouble();
        
        // Find the youngest friend (smallest age)
        int youngAge = Math.min(Math.min(amarAge, akbarAge), anthonyAge);
        String youngestFriend = "";
        
        if (youngAge == amarAge) {
            youngestFriend = "Amar";
        } else if (youngAge == akbarAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }
        
        // Find the tallest friend (largest height)
        double maxHeight = Math.max(Math.max(amarHeight, akbarHeight), anthonyHeight);
        String tallestFriend = "";
        
        if (maxHeight == amarHeight) {
            tallestFriend = "Amar";
        } else if (maxHeight == akbarHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }
        
        // Display results
        System.out.println("\nYoungest friend: " + youngestFriend + " with age " + youngAge);
        System.out.println("Tallest friend: " + tallestFriend + " with height " + maxHeight);
        
        // Close the Scanner Stream
        input.close();
    }
}
