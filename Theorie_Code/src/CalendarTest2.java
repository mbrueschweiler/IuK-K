import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest2 {
    Calendar feb28;
    Calendar feb29;

    @BeforeEach
    public void setUp() throws Exception {
        feb28 = new GregorianCalendar(2004, Calendar.FEBRUARY, 28);
        feb29 = new GregorianCalendar(2004, Calendar.FEBRUARY, 29);
    }

    @Test
    public void add1() {
        feb28.add(Calendar.DAY_OF_MONTH, 1);
        assertEquals(feb29, feb28);
    }

    @Test
    public void add2() {
        feb29.add(Calendar.DAY_OF_MONTH, -1);
        assertEquals(feb28, feb29);
    }
}
