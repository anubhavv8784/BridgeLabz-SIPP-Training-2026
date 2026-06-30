import java.util.*;

public class EventEntryVerificationSystem {
    private HashSet<String> registeredParticipants;

    public EventEntryVerificationSystem() {
        registeredParticipants = new HashSet<>();
    }

    public boolean registerParticipant(String emailId) {
        if (registeredParticipants.contains(emailId)) {
            System.out.println("Error: Participant with email " + emailId + " is already registered!");
            return false;
        } else {
            registeredParticipants.add(emailId);
            System.out.println("Participant with email " + emailId + " registered successfully!");
            return true;
        }
    }

    public boolean isRegistered(String emailId) {
        return registeredParticipants.contains(emailId);
    }

    public void displayAllParticipants() {
        System.out.println("\n=== All Registered Participants ===");
        if (registeredParticipants.isEmpty()) {
            System.out.println("No participants registered yet.");
        } else {
            int count = 1;
            for (String email : registeredParticipants) {
                System.out.println(count + ". " + email);
                count++;
            }
        }
        System.out.println("Total attendees eligible to enter the conference: " + registeredParticipants.size());
    }

    public static void main(String[] args) {
        EventEntryVerificationSystem system = new EventEntryVerificationSystem();

        System.out.println("=== Registering Participants ===");
        system.registerParticipant("alice@techconf.com");
        system.registerParticipant("bob@techconf.com");
        system.registerParticipant("charlie@techconf.com");
        system.registerParticipant("diana@techconf.com");

        System.out.println("\n=== Attempting Duplicate Registration ===");
        system.registerParticipant("alice@techconf.com");
        system.registerParticipant("bob@techconf.com");

        System.out.println("\n=== Checking Registration ===");
        if (system.isRegistered("eve@techconf.com")) {
            System.out.println("eve@techconf.com is registered.");
        } else {
            System.out.println("eve@techconf.com is not registered.");
        }

        system.displayAllParticipants();
    }
}
