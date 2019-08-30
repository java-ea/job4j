package ru.job4j.oop;

/**
 * Student - Петя баянист и коронная песня "Кузнечик".
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version 0.1
 * @since 30.08.2019.
 */
public class Student {

    public void music() {
        System.out.println("Tra tra tra");
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        for (int i = 0; i < 3; i++) {
            petya.music();
            petya.song();
        }
    }
}