package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "Edit item ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        String id = input.askStr("Enter Id: ");
        String name = input.askStr("Enter New Name: ");
        Item tmp = new Item(name);
        if (tracker.replace(id, tmp)) {
            tmp.setId(id);
            System.out.println("Application changed!");
        } else {
            System.out.println("Application not changed");
        }
        return true;
    }
}
