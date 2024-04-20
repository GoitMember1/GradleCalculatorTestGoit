import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testSumWithN1() {
        assertEquals(1, sumCalculator.sum(1));
    }

    @Test
    public void testSumWithN3() {
        assertEquals(6, sumCalculator.sum(3));
    }

    @Test
    public void testSumWithN0() {
        assertThrows(IllegalArgumentException.class, () -> {
            sumCalculator.sum(0);
        });
    }
}