package strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    private Sum sum;

    @BeforeEach
    public void before(){
        sum = new Sum();
    }

    @Test
    void operation() {
        double actual = sum.operation(3, 2);
        double expected = 5;
        assertEquals(expected, actual);
    }
}