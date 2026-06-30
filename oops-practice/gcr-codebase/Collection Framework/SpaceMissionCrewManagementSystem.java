import java.util.*;

public class SpaceMissionCrewManagementSystem {
    static class Astronaut {
        String astronautId;
        String name;
        String specialization;

        Astronaut(String astronautId, String name, String specialization) {
            this.astronautId = astronautId;
            this.name = name;
            this.specialization = specialization;
        }

        @Override
        public String toString() {
            return "ID: " + astronautId + ", Name: " + name + ", Specialization: " + specialization;
        }
    }

    private HashMap<String, List<Astronaut>> missionCrew;
    private HashMap<String, HashSet<String>> missionAstronautSet;

    public SpaceMissionCrewManagementSystem() {
        missionCrew = new HashMap<>();
        missionAstronautSet = new HashMap<>();
    }

    public void addMission(String missionName) {
        missionCrew.putIfAbsent(missionName, new ArrayList<>());
        missionAstronautSet.putIfAbsent(missionName, new HashSet<>());
        System.out.println("Mission '" + missionName + "' added successfully.");
    }

    public void assignAstronaut(String missionName, Astronaut astronaut) {
        if (!missionCrew.containsKey(missionName)) {
            System.out.println("Error: Mission '" + missionName + "' does not exist!");
            return;
        }

        HashSet<String> astronautSet = missionAstronautSet.get(missionName);

        if (astronautSet.contains(astronaut.astronautId)) {
            System.out.println("Error: Astronaut " + astronaut.name + " is already assigned to " + missionName + "!");
            return;
        }

        missionCrew.get(missionName).add(astronaut);
        astronautSet.add(astronaut.astronautId);
        System.out.println("Astronaut " + astronaut.name + " assigned to " + missionName + ".");
    }

    public void displayMissionDetails() {
        System.out.println("\n=== All Missions and Crew Members ===");
        for (String mission : missionCrew.keySet()) {
            List<Astronaut> crew = missionCrew.get(mission);
            System.out.println("\nMission: " + mission);
            System.out.println("Total astronauts assigned: " + crew.size());
            if (crew.isEmpty()) {
                System.out.println("  No crew members assigned.");
            } else {
                for (int i = 0; i < crew.size(); i++) {
                    System.out.println("  " + (i + 1) + ". " + crew.get(i));
                }
            }
        }
    }

    public int getTotalAstronautsForMission(String missionName) {
        if (missionCrew.containsKey(missionName)) {
            return missionCrew.get(missionName).size();
        }
        return 0;
    }

    public static void main(String[] args) {
        SpaceMissionCrewManagementSystem system = new SpaceMissionCrewManagementSystem();

        System.out.println("=== Adding Missions ===");
        system.addMission("Apollo 11");
        system.addMission("Artemis 1");
        system.addMission("Mars Mission");

        System.out.println("\n=== Creating Astronauts ===");
        Astronaut ast1 = new Astronaut("A001", "Neil Armstrong", "Commander");
        Astronaut ast2 = new Astronaut("A002", "Buzz Aldrin", "Lunar Module Pilot");
        Astronaut ast3 = new Astronaut("A003", "Michael Collins", "Command Module Pilot");
        Astronaut ast4 = new Astronaut("A004", "Kalpana Chawla", "Mission Specialist");
        Astronaut ast5 = new Astronaut("A005", "John Glenn", "Test Pilot");

        System.out.println("\n=== Assigning Astronauts to Missions ===");
        system.assignAstronaut("Apollo 11", ast1);
        system.assignAstronaut("Apollo 11", ast2);
        system.assignAstronaut("Apollo 11", ast3);

        system.assignAstronaut("Artemis 1", ast4);
        system.assignAstronaut("Artemis 1", ast5);

        system.assignAstronaut("Mars Mission", ast1);
        system.assignAstronaut("Mars Mission", ast4);

        System.out.println("\n=== Attempting Duplicate Assignment ===");
        system.assignAstronaut("Apollo 11", ast1);

        system.displayMissionDetails();

        System.out.println("\n=== Total Astronauts Per Mission ===");
        System.out.println("Apollo 11: " + system.getTotalAstronautsForMission("Apollo 11") + " astronauts");
        System.out.println("Artemis 1: " + system.getTotalAstronautsForMission("Artemis 1") + " astronauts");
        System.out.println("Mars Mission: " + system.getTotalAstronautsForMission("Mars Mission") + " astronauts");
    }
}
