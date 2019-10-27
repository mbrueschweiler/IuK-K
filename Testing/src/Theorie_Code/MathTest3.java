import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class MathTest3 {
    @Test
    public void testMax() {
        assertEquals(10, Math.max(10, 3));
        assertEquals(200, Math.max(35, 200));
    }
}
