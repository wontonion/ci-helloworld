public class ArrayUtils {

    /**
     * Find last index of element
     *
     * @param x array to search
     * @param y value to look for
     * @return last index of y in x; -1 if absent
     * @throws NullPointerException if x is null
     */
    // test: x = [2, 3, 5]; y = 2; Expected = 0
    public static int findLast (int[] x, int y) {
        for (int i=x.length-1; i >= 0; i--) {
            if (x[i] == y) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Count odd or positive elements
     *
     * @param x array to search
     * @return count of odd/positive values in x
     * @throws NullPointerException if x is null
     */
    // test: x = [-3, -2, 0, 1, 4]; Expected = 3
    public static int oddOrPos(int[] x) {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 != 0 || x[i] > 0) {
                count++;
            }
        }
        return count;
    }
}