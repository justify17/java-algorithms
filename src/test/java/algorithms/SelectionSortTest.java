package algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SelectionSortTest {

    @Test
    void run() {
        int[] array = {5, 4, 1, 6, 2};
        SelectionSort.run(array);
        assertArrayEquals(new int[]{1, 2, 4, 5, 6}, array);

        array = new int[]{1, 0, 0, 1, 0};
        SelectionSort.run(array);
        assertArrayEquals(new int[]{0, 0, 0, 1, 1}, array);

        array = new int[]{33, 11, 44, 99, 1};
        SelectionSort.run(array);
        assertArrayEquals(new int[]{1, 11, 33, 44, 99}, array);
    }
}