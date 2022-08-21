package algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecursionTest {

    @Test
    void factorial() {
        assertEquals(6, Recursion.factorial(3));
        assertEquals(1, Recursion.factorial(1));
        assertEquals(120, Recursion.factorial(5));
    }

    @Test
    void sum() {
        assertEquals(15, Recursion.sum(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, Recursion.sum(new int[]{0}));
        assertEquals(10, Recursion.sum(new int[]{-1, 1, 10}));
    }

    @Test
    void count() {
        assertEquals(1, Recursion.count(new int[]{100}));
        assertEquals(0, Recursion.count(new int[]{}));
        assertEquals(3, Recursion.count(new int[]{1, 2, 3}));
    }

    @Test
    void max() {
        assertEquals(111, Recursion.max(new int[]{1, 11, 111}));
        assertEquals(10, Recursion.max(new int[]{10}));
        assertEquals(2, Recursion.max(new int[]{-10, 2, -20}));
    }
}