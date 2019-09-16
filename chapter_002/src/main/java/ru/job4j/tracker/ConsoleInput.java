package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Робота с консолью.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version 0.1
 * @since 15.09.2019
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    /**
     * Ввод пользовательских данных из консоли.
     *
     * @param question - запрос пользователю с выводом в консоль.
     */
    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
}