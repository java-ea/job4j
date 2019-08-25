package ru.job4j.array;

/**
 * Square.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Square {
    /**
     * calculate.
     *
     * @param bound - Размер массива.
     * @return - массив чисел от 1 до bound, возведенными в квадрат.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        int q = 1;
        for (int i = 0; i < bound; i++) {
            rst[i] = q * q;
            q++;
        }
        return rst;
    }
}