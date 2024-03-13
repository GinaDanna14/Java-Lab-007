public class FeelingFruity {

    /**
     * Multiplies all elements in the given array.
     *
     * @param a The array of integers.
     * @return The product of all elements in the array.
     */
    public static int banana(int[] a) {
        int kiwi = 1;
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }

    /**
     * Finds the index of the first occurrence of a specified value in the array.
     *
     * @param a The array of integers.
     * @param grape The value to search for.
     * @return The index of the first occurrence of the value, or -1 if not found.
     */
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Counts the occurrences of a specified value in the array.
     *
     * @param a The array of integers.
     * @param apple The value to count.
     * @return The number of occurrences of the specified value in the array.
     */
    public static int pineapple(int[] a, int apple) {
        int pear = 0;
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }

}
