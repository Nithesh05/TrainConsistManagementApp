import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for Passenger Bogies
        List<String> train = new ArrayList<>();

        // Add Bogies
        train.add("Sleeper");
        train.add("AC Chair");
        train.add("First Class");

        // Display After Insertion
        System.out.println("\nAfter Adding Bogies:");
        displayConsist(train);

        // Remove a Bogie (AC Chair)
        train.remove("AC Chair");

        // Check if Sleeper Exists
        System.out.println("\nChecking if 'Sleeper' exists: " + train.contains("Sleeper"));

        // Final State
        System.out.println("\nFinal Train Consist:");
        displayConsist(train);
    }

    // Method to display train details
    public static void displayConsist(List<String> train) {
        for (int i = 0; i < train.size(); i++) {
            System.out.println("Bogie " + (i + 1) + ": " + train.get(i));
        }
    }
}