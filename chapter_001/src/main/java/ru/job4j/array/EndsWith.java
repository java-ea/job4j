package ru.job4j.array;

/**
 * EndWith.
 * Обертка над строкой.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version 0.1
 * @since 24.08.2019
 */
public class EndsWith {

    /**
     * endsWith.
     * Проверяет, что слово за слово заканчиваеться на...
     *
     * @param post префикс.
     * @param word слово.
     * @return result true, если слово заканчиваеться на...
     */
    public boolean endsWith(String word, String post) {
        boolean result = true;
        char[] pst = post.toCharArray();
        char[] wrd = word.toCharArray();
        int last = wrd.length - 1;
        for (int i = pst.length - 1; i >= 0; i--) {
            if (wrd[last] != pst[i]) {
                result = false;
                break;
            }
            last--;
        }
        return result;
    }
}