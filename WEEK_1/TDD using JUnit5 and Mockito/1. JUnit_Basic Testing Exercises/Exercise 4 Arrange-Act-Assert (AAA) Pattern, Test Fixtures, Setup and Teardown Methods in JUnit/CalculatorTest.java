import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calc;
    @Before
    public void setUp() {
        calc = new Calculator();
        System.out.println("Setup executed");
    }
    @After
    public void tearDown() {
        calc = null;
        System.out.println("Teardown executed");
    }

    @Test
    public void testAddition() {
        int a = 2;
        int b = 3;
        int result = calc.add(a, b);
        assertEquals(5, result);
    }

    @Test
    public void testMultiplication() {
        int a = 4;
        int b = 5;
        int result = calc.multiply(a, b);
        assertEquals(20, result);
    }
}