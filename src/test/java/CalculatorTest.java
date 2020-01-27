import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(10, calculator.add(1, 9));
    }

    @Test
    public void canSubtract(){
        assertEquals(7, calculator.subtract(20, 13));
    }

    @Test
    public void canMultiply(){
        assertEquals(56, calculator.multiply(7, 8));
    }

    @Test
    public void canDivide(){
        assertEquals(7, calculator.divide(49, 7), 0);
    }
}
