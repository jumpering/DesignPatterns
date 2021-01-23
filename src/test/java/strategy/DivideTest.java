package strategy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class DivideTest {

    private Divide divide;

    @BeforeEach
    public void before(){
        divide = new Divide();
    }

    @Test
    void operation() {
        double actual = divide.operation(6,2);
        double expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void testExpectedException() {
        assertThrows(ArithmeticException.class, () -> {
            divide.operation(6,0);
            divide.operation(0,6);
        });
    }
}