import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for Unique Bogie IDs
        Set<String> bogieSet = new HashSet<>();

        // Adding Bogie IDs (with duplicates)
        bogieSet.add("B1");
        bogieSet.add("B2");
        bogieSet.add("B3");
        bogieSet.add("B1"); // Duplicate
        bogieSet.add("B2"); // Duplicate

        // Display Unique Bogies
        System.out.println("\nUnique Bogie IDs:");
        for (String bogie : bogieSet) {
            System.out.println(bogie);
        }
    }
}