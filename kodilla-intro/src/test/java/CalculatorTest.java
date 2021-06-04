import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(30, calculator.add(10.0, 20.0));

    }

    @Test
    void sub() {
        assertEquals(-10, calculator.sub(10.0, 20.0));
    }

    @Test
    void circleArea() {
        String name = "name";
        assertEquals(314.15927, calculator.circleArea(10.0));
    }

    @Test
    void circlePerimeter() {
        assertEquals(62.831854, calculator.circlePerimeter(10.0));
    }
}