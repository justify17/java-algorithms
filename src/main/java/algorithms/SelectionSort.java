package algorithms;

public class SelectionSort {

    public static void run(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minElemIndex = i;
            int minElem = array[i];

            for (int j = i + 1; j < array.length; j++) {
                int temp = array[j];

                if (temp < minElem) {
                    minElemIndex = j;
                    minElem = temp;
                }
            }

            if (minElemIndex != i) {
                array[minElemIndex] = array[i];
                array[i] = minElem;
            }
        }
    }
}
