package ru.job4j.array;

/**
 * ArrayChar Обертка над строкой.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version 0.2
 * @since 24.08.2019
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
        boolean result = true;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
        for (int i = 0; i <= pref.length-1; i++) {
            if (pref[i] != wrd[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
