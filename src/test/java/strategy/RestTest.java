package strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestTest {

    private Rest rest;

    @BeforeEach
    public void before(){
        rest = new Rest();
    }

    @Test
    void operation() {
        double actual = rest.operation(3, 2);
        double expected = 1;
        assertEquals(expected, actual);
    }
}