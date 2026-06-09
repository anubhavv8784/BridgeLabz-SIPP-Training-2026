// EarthVolumeCalculator computes the volume of Earth in cubic kilometers and cubic miles
public class EarthVolumeCalculator {
    public static void main(String[] args) {
        double earthRadiusInKilometers = 6378;
        double pi = 3.14159265359;

        double volumeInCubicKilometers = (4.0 / 3.0) * pi * earthRadiusInKilometers * earthRadiusInKilometers * earthRadiusInKilometers;

        double kmToMilesConversionFactor = 0.621371;
        double volumeInCubicMiles = volumeInCubicKilometers * (kmToMilesConversionFactor * kmToMilesConversionFactor * kmToMilesConversionFactor);

        System.out.println("The volume of earth in cubic kilometers is " + volumeInCubicKilometers + " and cubic miles is " + volumeInCubicMiles);
    }
}
