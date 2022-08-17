package algorithms;

public class BinarySearch {

    public static Integer run(int[] array, int element) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];

            if (guess == element) {
                return mid;
            }

            if (guess > element) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return null;
    }
}
