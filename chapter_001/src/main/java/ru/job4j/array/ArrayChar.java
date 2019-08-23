package ru.job4j.array;

/**
 * ArrayChar Обертка над строкой.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version 0.1
 * @since 23.08.2019
 */
public class ArrayChar {
    /**
     * startWith.
     * Проверяет, что слово начинается с префикса.
     *
     * @param word   слово.
     * @param prefix префикс.
     * @return если слово начинаеться с префикса return true.
     */
    public boolean startsWith(String word, String prefix) {
        boolean result = false;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
        if (word.startsWith(prefix)) {
            result = true;
        }
        return result;
    }
}
