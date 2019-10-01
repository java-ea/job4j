package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Application search ===");
        String id = input.askStr("Enter Id: ");
        Item tmp = tracker.findById(id);
        if (tmp != null) {
            System.out.println("Application found.");
            System.out.println(tmp);
        } else {
            System.out.println("Application not found.");
        }
        return true;
    }
}
