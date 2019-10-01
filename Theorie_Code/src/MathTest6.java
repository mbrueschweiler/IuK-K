import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class MathTest6 {
    @Test
    public void testMax() {

        //given
        int a = 10;
        int b = 3;

        //when
        int c = Math.max(a,b);
        int d = Math.max(b,a);

        //then
        assertEquals(10, c);
        assertEquals(10, d);
    }
}
