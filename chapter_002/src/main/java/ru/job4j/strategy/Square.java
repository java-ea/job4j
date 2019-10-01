package ru.job4j.strategy;

/**
 * Реализация квадрата.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version 0.1
 * @since 23.09.2019
 */
public class Square implements Shape {
    public String draw() {
        StringBuilder pic = new StringBuilder();
        String ln = System.lineSeparator();
        pic.append("++++");
        pic.append(ln);
        pic.append("+  +");
        pic.append(ln);
        pic.append("+  +");
        pic.append(ln);
        pic.append("++++");
        return pic.toString();
    }
}