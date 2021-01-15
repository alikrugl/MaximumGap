public class Solution {
    /**
     * Given an array/list [] of integers.
     * Find The maximum difference between the successive elements in its sorted form.
     * <p>
     * Notes:
     * - Array/list size is at least 3 .
     * - Array/list's numbers will be mixture of positives and negatives also zeros.
     * - Repetition of numbers in the array/list could occur.
     * - The Maximum Gap is computed Regardless the sign.
     */
    public static int maxGap(int[] numbers) {
        int max = Integer.MIN_VALUE;

        java.util.Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            if ((numbers[i] - numbers[i + 1]) > max) max = numbers[i] - numbers[i + 1];
            if ((numbers[i + 1] - numbers[i]) > max) max = numbers[i + 1] - numbers[i];
        }

        return max;
    }
}