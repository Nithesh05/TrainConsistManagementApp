import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    @Test
    void testLoopVsStreamResultEquality() {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("Sleeper", 72));

        // Loop result
        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        // Stream result
        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Compare results
        assertEquals(loopResult.size(), streamResult.size());
    }
}