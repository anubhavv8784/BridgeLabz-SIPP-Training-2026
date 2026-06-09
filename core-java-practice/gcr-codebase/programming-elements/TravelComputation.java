import java.util.Scanner;

// Create TravelComputation class to compute the distance and travel time.
public class TravelComputation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a variable travelerName to indicate the person traveling
        String travelerName = "Eric";

        // Create variables to indicate the fromCity, viaCity and toCity
        String fromCity = "Chennai";
        String viaCity = "Vellore";
        String toCity = "Bangalore";

        // Create a variable distanceFromSourceToVia to indicate the distance from fromCity to viaCity
        double distanceFromSourceToVia = 156.6;

        // Create a variable timeFromSourceToVia to indicate the time taken in minutes
        int timeFromSourceToVia = 4 * 60 + 4;

        // Create a variable distanceFromViaToDestination to indicate the distance from viaCity to toCity
        double distanceFromViaToDestination = 211.8;

        // Create a variable timeFromViaToDestination to indicate the time taken in minutes
        int timeFromViaToDestination = 4 * 60 + 25;

        // Create a variable totalDistance to indicate the total distance traveled
        double totalDistance = distanceFromSourceToVia + distanceFromViaToDestination;

        // Create a variable totalTimeInMinutes to indicate the total time taken
        int totalTimeInMinutes = timeFromSourceToVia + timeFromViaToDestination;

        // Print the travel details
        System.out.println("The total distance travelled by " + travelerName + " from " +
                fromCity + " to " + toCity + " via " + viaCity + " is " +
                totalDistance + " km and the total time taken is " +
                totalTimeInMinutes + " minutes");

        input.close();
    }
}
