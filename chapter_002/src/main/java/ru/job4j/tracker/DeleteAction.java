package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete Item ===");
        String id = input.askStr("Enter Id: ");
        if (tracker.delete(id)) {
            System.out.println("Application successfully deleted");
        } else {
            System.out.println("Application not deleted");
        }

        return true;
    }
}
