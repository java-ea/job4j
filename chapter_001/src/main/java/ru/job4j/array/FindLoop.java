package ru.job4j.array;

/**
 * FindLoop.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version 0.2
 * @since 23.08.2019.
 */
public class FindLoop {
    /**
     * indexOf.
     * Поиск индекса в массиве.
     *
     * @param data - входящий массив.
     * @param el   - элемент массива который мы ищем.
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

    /**
     * indexOf.
     * Поиск индекса в диапазоне.
     *
     * @param data   - входящий массив.
     * @param el     - элемент массива который мы ищем.
     * @param start  - индекс с которого мы начинаем поиск.
     * @param finish - индекс на котором мы заканчиваем поиск.
     * @return - индекс элемента в массиве.
     */
    public int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }

        }
        return rst;
    }

    /**
     * sort.
     * Сортировка выборкой.
     *
     * @param data - входящий массив.
     * @return data - отсортированный массив.
     */
    public int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
        return data;
    }
}
