package ru.job4j.tracker;

public class CreateAction extends BaseAction {

    public CreateAction(String name) {
        super(name);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Application with the name: " + name + " and id: " + item.getId() + " was successfully added");
        return true;
    }
}
