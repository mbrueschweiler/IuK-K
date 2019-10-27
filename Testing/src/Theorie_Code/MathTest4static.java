import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class MathTest4static {
    @Test
    public void testMax() {
        // mit statischem import
        assertEquals(10,Math.max(10, 3));
    }
}
