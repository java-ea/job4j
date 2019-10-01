package ru.job4j.tracker;

/**
 * Интерфейс отвечающий за действия пользователя.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version 0.1
 * @since 01.10.2019
 */
public interface UserAction {
    String name();

    boolean execute(Input input, Tracker tracker);
}
