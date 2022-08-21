package algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QuickSortTest {

    @Test
    void run() {
        int[] array = {57, 55, 56};
        QuickSort.run(array, 0, array.length - 1);
        assertArrayEquals(new int[]{55, 56, 57}, array);

        array = new int[]{33, 11, 22, 100, 44};
        QuickSort.run(array, 0, array.length - 1);
        assertArrayEquals(new int[]{11, 22, 33, 44, 100}, array);

        array = new int[]{33, 10};
        QuickSort.run(array, 0, array.length - 1);
        assertArrayEquals(new int[]{10, 33}, array);
    }
}