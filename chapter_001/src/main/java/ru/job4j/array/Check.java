package ru.job4j.array;

/**
 * Check.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version 0.2
 * @since 24.08.2019
 */
public class Check {
    /**
     * mono.
     *
     * @param data - входной массив.
     * @return result - все элементы в массиве являются true или false.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i <= data.length - 1; i++) {
            if (data[0] != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}