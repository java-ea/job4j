package ru.job4j.array;
/**
 * MatrixCheck.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version 0.1
 * @since 24.08.2019
 */
public class MatrixCheck {
    /**
     * mono.
     * Проверяет что все элементы по диагоналям равны true или false.
     *
     * @param data - входной массив.
     * @return result - все элементы по диагоналям равны true или false.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        /**
         * проверка по 1 диагонали
         */
        for (int i = 0; i < data.length - 1; i++) {
            int j = i + 1;
            if (data[i][i] != data[j][j]) {
                result = false;
                break;
            }
        }
        /**
         * проверка по 2 диагонали
         */
        for (int i = data.length - 1; i > 0; i--) {
            int j = data.length - 1 - i;
            if (data[i][j] != data[i - 1][j + 1]) {
                result = false;
                break;
            }

        }
        return result;
    }
}