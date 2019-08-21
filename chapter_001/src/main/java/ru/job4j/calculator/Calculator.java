package ru.job4j.calculator;
/**
 * Calculator.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Calculator {

    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + "+" + second + "=" + result);
    }

    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + "/" + second + "=" + result);
    }

    public static void mul(double first, double second) {
        double result = first * second;
        System.out.println(first + "*" + second + "=" + result);
    }

    public static void sub(double first, double second) {
        double result = first - second;
        System.out.println(first + "-" + second + "=" + result);
    }

    /**
     * main.
     *
     * @param args - args.
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        mul(2, 1);
        sub(10, 5);
    }
}
