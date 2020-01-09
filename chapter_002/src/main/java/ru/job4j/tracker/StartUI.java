package ru.job4j.tracker;

import java.util.ArrayList;

/**
 * Робота с пользователем.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version 0.1
 * @since 15.09.2019
 */
public class StartUI {
    /**
     * Конструтор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     * @param actions масив команд.
     */
    public void init(Input input, Tracker tracker, ArrayList<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    /**
     * Метод отвечающий за вывод в консоль меню.
     *
     * @param actions масив команд.
     */
    private void showMenu(ArrayList<UserAction> actions) {
        System.out.println("Menu.");
        int index = 0;
        for (UserAction action : actions) {
            System.out.println(index + ". " + action.name());
            index++;
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        ArrayList<UserAction> actions = new ArrayList<UserAction>();
        actions.add(new CreateAction("Create a new Item "));
        actions.add(new ShowAllAction("Show all items "));
        actions.add(new EditAction("Edit item "));
        actions.add(new DeleteAction("Delete item "));
        actions.add(new FindByIdAction("Find item by Id"));
        actions.add(new FindByNameAction("Find item by Name"));
        actions.add(new ExitAction("Exit"));
        new StartUI().init(validate, tracker, actions);
    }
}