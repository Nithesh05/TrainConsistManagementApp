import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for Train Formation
        Set<String> train = new LinkedHashSet<>();

        // Add Bogies (with duplicate)
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");
        train.add("Sleeper"); // Duplicate (ignored)

        // Display Final Formation
        System.out.println("\nFinal Train Formation (Order Maintained, No Duplicates):");
        for (String bogie : train) {
            System.out.println(bogie);
        }
    }
}