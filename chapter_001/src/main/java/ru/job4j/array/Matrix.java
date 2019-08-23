package ru.job4j.array;

/**
 * Matrix.
 * Таблица умножения.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version 0.1
 * @since 23.08.2019.
 */
public class Matrix {
    /**
     * multiple.
     * Построения таблицы умножения в массиве.
     *
     * @param size - розмер таблицы.
     * @return table - таблица умножения.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}