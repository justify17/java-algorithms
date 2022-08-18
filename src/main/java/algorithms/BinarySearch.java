package algorithms;

public class BinarySearch {

    public static Integer run(int[] sortedArray, int item) {
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = sortedArray[mid];

            if (guess == item) {
                return mid;
            }

            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return null;
    }
}
