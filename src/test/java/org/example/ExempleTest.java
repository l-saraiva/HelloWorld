package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExempleTest {
    Calcul c = new Calcul();
    @Test
    public void test() {
        assertEquals(true, true);
    }

    @Test
    public void testAdditionPositive(){
        assertEquals(10, c.add(5,5));
    }

    @Test
    public void testAdditionNegative(){
        assertEquals(-10, c.add(-5,-5));
    }
}