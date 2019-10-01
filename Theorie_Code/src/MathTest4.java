import org.junit.jupiter.api.*;

public class MathTest4 {
    @Test
    public void testMax() {
        // ohne statischem import
        Assertions.assertEquals(10,Math.max(10, 3));
    }
}
