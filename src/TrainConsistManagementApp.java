import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // 1. Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 2. Initialize Train Consist (Dynamic List)
        List<String> train = new ArrayList<>();

        // 3. Display Initial Bogie Count
        System.out.println("Initial Bogie Count: " + train.size());

        // 4. Display Consist Summary
        displayConsist(train);
    }

    // Method to display train details
    public static void displayConsist(List<String> train) {
        System.out.println("\n--- Train Consist Summary ---");

        if (train.isEmpty()) {
            System.out.println("No bogies attached.");
        } else {
            for (int i = 0; i < train.size(); i++) {
                System.out.println("Bogie " + (i + 1) + ": " + train.get(i));
            }
        }
    }
}