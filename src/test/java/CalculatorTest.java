import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void addNumbers (){
        assertEquals(8, calculator.add(4,4));
    }

    @Test
    public void subtractNumbers(){
        assertEquals(44, calculator.subtract(64, 20));
    }

    @Test
    public void multiplyNumbers(){
        assertEquals(100, calculator.multiply(50, 2));
    }

    @Test
    public void divideNumbers(){
        assertEquals(1.0, calculator.divide(6.3, 6.3), 0.001);
    }
}
