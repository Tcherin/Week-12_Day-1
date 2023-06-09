import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    public void canSubtract() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void canMultiply() {
        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    public void canDivide() {
        assertEquals(2.0, calculator.divide(10.0, 5.0), 0.0);
    }
}
