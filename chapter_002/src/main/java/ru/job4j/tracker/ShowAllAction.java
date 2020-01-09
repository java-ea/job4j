package ru.job4j.tracker;

public class ShowAllAction extends BaseAction {
    public ShowAllAction(String name) {
        super(name);
    }


    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        System.out.println(tracker.findAll());
        return true;
    }
}
