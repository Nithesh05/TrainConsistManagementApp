import java.util.*;

// Custom Exception
class InvalidCapacityException extends Exception {
    InvalidCapacityException(String message) {
        super(message);
    }
}

// Bogie Class with validation
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than 0");
        }
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<Bogie> bogies = new ArrayList<>();

        try {
            // Valid bogie
            bogies.add(new Bogie("Sleeper", 72));

            // Invalid bogie (will throw exception)
            bogies.add(new Bogie("AC Chair", -10));

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}