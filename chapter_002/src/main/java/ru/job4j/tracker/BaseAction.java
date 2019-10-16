package ru.job4j.tracker;

public abstract class BaseAction implements UserAction {
    private final String name;

    public BaseAction(final String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return true;
    }

}
