package ru.job4j.array;
/**
 * FindLoop.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class FindLoop {
    /**
     * indexOf.
     *
     * @param data - входящий массив.
     * @param el - элемент массива который мы ищем.
     * @return - индекс элемента в массиве.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}
