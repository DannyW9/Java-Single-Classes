import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator numbers;

    @Before
    public void before(){
        numbers = new Calculator(15, 10);
    }

    @Test
    public void canAdd(){
        assertEquals(25, numbers.add());
    }

    @Test
    public void canSubtract(){
        assertEquals(5, numbers.subtract());
    }

    @Test
    public void canMultiply(){
        assertEquals(150, numbers.multiply());
    }

    @Test
    public void canDivide(){
        assertEquals(1.5, numbers.divide(), 0.1);
    }


}



