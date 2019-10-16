package ru.job4j.tracker;

import java.util.Arrays;

public class ShowAllAction extends BaseAction {
    public ShowAllAction(String name) {
        super(name);
    }


    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        System.out.println(Arrays.toString(tracker.findAll()));
        return true;
    }
}
