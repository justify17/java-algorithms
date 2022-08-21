package algorithms;

import java.util.Arrays;

public class Recursion {

    private Recursion() {
    }

    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    public static int sum(int[] array) {
        if (array.length == 1) {
            return array[0];
        } else {
            return array[0] + sum(Arrays.copyOfRange(array, 1, array.length));
        }
    }

    public static int count(int[] array) {
        if (array.length == 0) {
            return 0;
        } else {
            return 1 + count(Arrays.copyOfRange(array, 1, array.length));
        }
    }

    public static int max(int[] array) {
        if (array.length == 1) {
            return array[0];
        } else {
            return Math.max(array[0], max(Arrays.copyOfRange(array, 1, array.length)));
        }
    }
}