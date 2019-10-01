package ru.job4j.exam;

/**
 * Exam.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version 0.2
 * @since 28.08.2019
 */
public class Exam {
    /**
     * merge - объеденяет два отсортированых массива.
     *
     * @param left  первый массив.
     * @param right второй массив.
     * @return массив, который появится после слияния.
     */
    int[] merge(int[] left, int[] right) {
        int[] result = new int[right.length + left.length];
        int r = 0;
        int l = 0;
        for (int res = 0; res < result.length; res++) {
            if (r < right.length && l < left.length) {
                if (right[r] < left[l]) {
                    result[res] = right[r];
                    r++;
                } else {
                    result[res] = left[l];
                    l++;
                }
            } else {
                if (l < left.length) {
                    result[res] = left[l];
                    l++;
                }
                if (r < right.length) {
                    result[res] = right[r];
                    r++;
                }
            }
        }
        return result;
    }
}