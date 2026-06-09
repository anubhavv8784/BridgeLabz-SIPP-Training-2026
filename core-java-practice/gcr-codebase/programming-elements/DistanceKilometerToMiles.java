// DistanceKilometerToMiles converts a fixed distance of 10.8 km to miles
public class DistanceKilometerToMiles {
    public static void main(String[] args) {
        double distanceInKilometers = 10.8;
        double conversionFactor = 1.6;
        double distanceInMiles = distanceInKilometers / conversionFactor;

        System.out.println("The distance " + distanceInKilometers + " km in miles is " + distanceInMiles);
    }
}
