import org.junit.jupiter.api.Test;
import java.util.regex.*;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    @Test
    void testValidTrainId() {
        String pattern = "TRN-\\d{4}";
        assertTrue(Pattern.matches(pattern, "TRN-1234"));
    }

    @Test
    void testInvalidTrainId() {
        String pattern = "TRN-\\d{4}";
        assertFalse(Pattern.matches(pattern, "TRN-12"));
    }

    @Test
    void testValidCargoCode() {
        String pattern = "PET-[A-Z]{2}";
        assertTrue(Pattern.matches(pattern, "PET-AB"));
    }

    @Test
    void testInvalidCargoCode() {
        String pattern = "PET-[A-Z]{2}";
        assertFalse(Pattern.matches(pattern, "PET-123"));
    }
}