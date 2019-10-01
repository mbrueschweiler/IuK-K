import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class ExceptionsTest {
    @Test public void test() {
        try {
            int[] a = new int[2];
            a[3] = 0;
            fail();
        } catch (ArrayIndexOutOfBoundsException ex) {
            //
        } catch (Exception ex) {
            fail();
        }
    }
}
