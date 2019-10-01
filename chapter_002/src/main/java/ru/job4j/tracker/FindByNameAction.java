package ru.job4j.tracker;

import java.util.Arrays;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "Find item by Name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Application search ===");
        String name = input.askStr("Enter Name: ");
        Item[] tmp = tracker.findByName(name);
        if (tmp != null) {
            System.out.println("Application found.");
            System.out.println(Arrays.toString(tmp));
        } else {
            System.out.println("Application not found.");
        }
        return true;
    }
}
