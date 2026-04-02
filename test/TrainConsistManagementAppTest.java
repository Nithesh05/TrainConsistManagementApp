import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    @Test
    void testTotalCapacity() {

        // Input
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        // Process
        int result = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // Assertion
        assertEquals(172, result);
    }
}