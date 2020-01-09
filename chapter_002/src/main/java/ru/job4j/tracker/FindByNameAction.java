package ru.job4j.tracker;

import java.util.ArrayList;

public class FindByNameAction extends BaseAction {
    public FindByNameAction(String name) {
        super(name);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Application search ===");
        String name = input.askStr("Enter Name: ");
        ArrayList<Item> tmp = tracker.findByName(name);
        if (tmp != null) {
            System.out.println("Application found.");
            System.out.println(tmp);
        } else {
            System.out.println("Application not found.");
        }
        return true;
    }
}
