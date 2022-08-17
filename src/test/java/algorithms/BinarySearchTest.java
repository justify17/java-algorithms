package algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class BinarySearchTest {

    @Test
    void run() {
        assertEquals(4, BinarySearch.run(new int[]{1, 3, 5, 7, 9}, 9));
        assertEquals(2, BinarySearch.run(new int[]{11, 19, 21, 35, 40, 58}, 21));
        assertNull(BinarySearch.run(new int[]{1, 2, 3}, -5));
    }
}