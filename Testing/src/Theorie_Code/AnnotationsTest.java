import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class AnnotationsTest {
    @BeforeAll
    public static void setUpBeforeAll() { System.out.println("@BeforeAll"); }

    @AfterAll
    public static void tearDownAfterAll() { System.out.println("@AfterAll"); }

    @BeforeEach
    public void setUp() { System.out.println("@BeforeEach"); }

    @AfterEach
    public void tearDown() { System.out.println("@AfterEach"); }

    @Test
    public void test1() { System.out.println("test1"); }

    @Test
    public void test2() { System.out.println("test2"); }
}
