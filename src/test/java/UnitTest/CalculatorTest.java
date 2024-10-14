package UnitTest;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void sum2plus3(){
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2,3));
    }
}