package algorithms;

import java.math.BigDecimal;

public class QuickSort {

    private QuickSort() {
    }

    public static void run(int[] array, int fromIndex, int toIndex) {
        if (fromIndex < toIndex) {
            int partitionIndex = partition(array, fromIndex, toIndex);

            run(array, fromIndex, partitionIndex - 1);
            run(array, partitionIndex + 1, toIndex);
        }
    }

    private static int partition(int[] array, int fromIndex, int toIndex) {
        int support = array[toIndex];
        int partitionIndex = fromIndex;

        for (int i = fromIndex; i < toIndex; i++) {
            if (array[i] <= support) {
                int temp = array[partitionIndex];
                array[partitionIndex] = array[i];
                array[i] = temp;

                partitionIndex++;
            }
        }

        int temp = array[partitionIndex];
        array[partitionIndex] = support;
        array[toIndex] = temp;

        return partitionIndex;
    }
}