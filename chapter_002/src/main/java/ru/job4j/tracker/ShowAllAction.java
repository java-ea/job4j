package ru.job4j.tracker;

import java.util.Arrays;

public class ShowAllAction implements UserAction {
    @Override
    public String name() {
        return "Show all items ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        System.out.println(Arrays.toString(tracker.findAll()));
        return true;
    }
}
