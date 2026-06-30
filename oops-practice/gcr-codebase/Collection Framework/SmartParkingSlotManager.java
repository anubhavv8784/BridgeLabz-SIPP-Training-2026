import java.util.*;

public class SmartParkingSlotManager {
    private ArrayList<String> parkedVehicles;

    public SmartParkingSlotManager() {
        parkedVehicles = new ArrayList<>();
    }

    public void addVehicle(String registrationNumber) {
        parkedVehicles.add(registrationNumber);
        System.out.println("Vehicle " + registrationNumber + " entered the parking area.");
    }

    public void removeVehicle(String registrationNumber) {
        if (parkedVehicles.contains(registrationNumber)) {
            parkedVehicles.remove(registrationNumber);
            System.out.println("Vehicle " + registrationNumber + " exited the parking area.");
        } else {
            System.out.println("Vehicle " + registrationNumber + " not found in the parking area!");
        }
    }

    public boolean searchVehicle(String registrationNumber) {
        return parkedVehicles.contains(registrationNumber);
    }

    public void displayAllVehicles() {
        System.out.println("\n=== Parked Vehicles ===");
        if (parkedVehicles.isEmpty()) {
            System.out.println("No vehicles currently parked.");
        } else {
            for (int i = 0; i < parkedVehicles.size(); i++) {
                System.out.println((i + 1) + ". " + parkedVehicles.get(i));
            }
        }
        System.out.println("Total occupied parking slots: " + parkedVehicles.size());
    }

    public static void main(String[] args) {
        SmartParkingSlotManager manager = new SmartParkingSlotManager();

        System.out.println("=== Adding Vehicles ===");
        manager.addVehicle("KA01AB1001");
        manager.addVehicle("MH02CD2002");
        manager.addVehicle("DL03EF3003");
        manager.addVehicle("GJ04GH4004");

        manager.displayAllVehicles();

        System.out.println("\n=== Searching Vehicle ===");
        if (manager.searchVehicle("KA01AB1001")) {
            System.out.println("Vehicle KA01AB1001 is currently parked.");
        }
        if (!manager.searchVehicle("TS05IJ5005")) {
            System.out.println("Vehicle TS05IJ5005 is not in the parking area.");
        }

        System.out.println("\n=== Removing Vehicles ===");
        manager.removeVehicle("MH02CD2002");
        manager.removeVehicle("TS05IJ5005");

        manager.displayAllVehicles();
    }
}
