package ru.job4j.tracker;

/**
 * Робота с пользователем.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version 0.1
 * @since 15.09.2019
 */
public interface Input {
    String askStr(String question);
    int askInt(String question);
}
