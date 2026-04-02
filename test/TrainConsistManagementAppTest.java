import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    @Test
    void testValidCapacity() {
        assertDoesNotThrow(() -> {
            new Bogie("Sleeper", 72);
        });
    }

    @Test
    void testInvalidCapacity() {
        assertThrows(InvalidCapacityException.class, () -> {
            new Bogie("AC Chair", -5);
        });
    }
}