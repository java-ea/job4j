package ru.job4j.tracker;

public class EditAction extends BaseAction {
    public EditAction(String name) {
        super(name);
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
