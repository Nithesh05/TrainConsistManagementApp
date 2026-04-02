import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " -> " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create List
        List<Bogie> bogies = new ArrayList<Bogie>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        // Stream filter (IMPORTANT: use collect instead of toList)
        List<Bogie> filteredList = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display result
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        for (Bogie b : filteredList) {
            System.out.println(b);
        }
    }
}