package ru.job4j.exam;

/**
 * Exam.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version 0.1
 * @since 28.08.2019
 */
public class Exam {
    /**
     * merge - объеденяет два отсортированых массива.
     *
     * @param left
     * @param right
     * @return массив, который появится после слияния.
     */
    int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int count = 0;
        for (int i = 0; i < (left.length); i++) {
            if (right[i] > left[i]) {
                result[i + count] = left[i];
                result[i + 1 + count] = right[i];
            } else {
                result[i + count] = right[i];
                result[i + 1 + count] = left[i];
            }
            count++;
        }
        return result;
    }
}
