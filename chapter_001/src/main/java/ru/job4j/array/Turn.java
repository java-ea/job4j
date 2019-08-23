package ru.job4j.array;

/**
 * Turn.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Turn {
    /**
     * back.
     *
     * @param array - входной массив.
     * @return - перевернутый массив задом наперёд..
     */
    public int[] back(int[] array) {
        int temp;
        int backCounter = 1;
        for (int i = 0; i <= (array.length - 1) / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - backCounter];
            array[array.length - backCounter] = temp;
            backCounter++;
        }
        return array;
    }
}