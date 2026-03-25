import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for Train Consist
        LinkedList<String> train = new LinkedList<>();

        // Add Bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        // Insert Pantry Car at position 2 (index 1)
        train.add(1, "Pantry Car");

        // Remove First and Last Bogie
        train.removeFirst();
        train.removeLast();

        // Display Final Train Consist
        System.out.println("\nFinal Train Consist:");
        for (int i = 0; i < train.size(); i++) {
            System.out.println("Bogie " + (i + 1) + ": " + train.get(i));
        }
    }
}