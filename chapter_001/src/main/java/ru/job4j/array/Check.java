package ru.job4j.array;
/**
 * Check.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version 0.1
 * @since 23.08.2019
 */
public class Check {
    /**
     * mono.
     *
     * @param data - входной массив.
     * @return result - все элементы в массиве являются true или false.
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
        int count = 1;
        for (int i = 0; i <= data.length / 2; i++) {
            if (data[i] == data[data.length - count]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}