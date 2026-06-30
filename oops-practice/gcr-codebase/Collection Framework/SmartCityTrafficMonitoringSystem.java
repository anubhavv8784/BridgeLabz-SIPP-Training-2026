import java.util.*;

public class SmartCityTrafficMonitoringSystem {
    private HashMap<String, Integer> roadTraffic;
    private TreeMap<String, Integer> sortedRoadTraffic;

    public SmartCityTrafficMonitoringSystem() {
        roadTraffic = new HashMap<>();
        sortedRoadTraffic = new TreeMap<>();
    }

    public void addOrUpdateRoad(String roadName, int vehicleCount) {
        roadTraffic.put(roadName, vehicleCount);
        sortedRoadTraffic.put(roadName, vehicleCount);
        System.out.println("Road '" + roadName + "' updated with " + vehicleCount + " vehicles.");
    }

    public void updateVehicleCount(String roadName, int additionalVehicles) {
        if (roadTraffic.containsKey(roadName)) {
            int currentCount = roadTraffic.get(roadName);
            int newCount = currentCount + additionalVehicles;
            roadTraffic.put(roadName, newCount);
            sortedRoadTraffic.put(roadName, newCount);
            System.out.println("Road '" + roadName + "' updated. New count: " + newCount + " vehicles.");
        } else {
            System.out.println("Error: Road '" + roadName + "' not found!");
        }
    }

    public void displayRoadsSorted() {
        System.out.println("\n=== Roads and Vehicle Counts (Sorted by Road Name) ===");
        for (String road : sortedRoadTraffic.keySet()) {
            System.out.println(road + ": " + sortedRoadTraffic.get(road) + " vehicles");
        }
    }

    public String getBusiestRoad() {
        if (roadTraffic.isEmpty()) {
            return "No roads monitored yet.";
        }

        String busiestRoad = null;
        int maxVehicles = 0;

        for (String road : roadTraffic.keySet()) {
            int count = roadTraffic.get(road);
            if (count > maxVehicles) {
                maxVehicles = count;
                busiestRoad = road;
            }
        }

        return "Busiest Road: " + busiestRoad + " with " + maxVehicles + " vehicles";
    }

    public void generateTrafficReport() {
        System.out.println("\n=== Comprehensive Traffic Analysis Report ===");
        System.out.println("Total roads monitored: " + roadTraffic.size());

        if (roadTraffic.isEmpty()) {
            System.out.println("No traffic data available.");
            return;
        }

        System.out.println("\nDetailed Traffic Status:");
        int totalVehicles = 0;

        for (String road : sortedRoadTraffic.keySet()) {
            int count = sortedRoadTraffic.get(road);
            totalVehicles += count;
            String trafficStatus = getTrafficStatus(count);
            System.out.println(road + ": " + count + " vehicles - " + trafficStatus);
        }

        System.out.println("\nTotal vehicles across all roads: " + totalVehicles);
        System.out.println(getBusiestRoad());

        double avgVehicles = (double) totalVehicles / roadTraffic.size();
        System.out.println(String.format("Average vehicles per road: %.2f", avgVehicles));
    }

    private String getTrafficStatus(int vehicleCount) {
        if (vehicleCount < 50) {
            return "Light Traffic";
        } else if (vehicleCount < 100) {
            return "Moderate Traffic";
        } else if (vehicleCount < 200) {
            return "Heavy Traffic";
        } else {
            return "Congestion";
        }
    }

    public static void main(String[] args) {
        SmartCityTrafficMonitoringSystem system = new SmartCityTrafficMonitoringSystem();

        System.out.println("=== Adding Roads and Vehicle Counts ===");
        system.addOrUpdateRoad("Main Street", 75);
        system.addOrUpdateRoad("Park Avenue", 120);
        system.addOrUpdateRoad("Broadway", 190);
        system.addOrUpdateRoad("Fifth Avenue", 45);
        system.addOrUpdateRoad("Seventh Avenue", 85);
        system.addOrUpdateRoad("Madison Avenue", 150);

        system.displayRoadsSorted();

        System.out.println("\n=== Identifying Busiest Road ===");
        System.out.println(system.getBusiestRoad());

        System.out.println("\n=== Updating Vehicle Counts ===");
        system.updateVehicleCount("Main Street", 25);
        system.updateVehicleCount("Fifth Avenue", 55);

        system.displayRoadsSorted();

        System.out.println("\n=== Summary ===");
        System.out.println("Total roads being monitored: " + system.roadTraffic.size());

        system.generateTrafficReport();
    }
}
