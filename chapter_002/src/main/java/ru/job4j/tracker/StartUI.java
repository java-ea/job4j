package ru.job4j.tracker;

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
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.length);
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    /**
     * Метод отвечающий за вывод в консоль меню.
     *
     * @param actions масив команд.
     */
    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction("Create a new Item "),
                new ShowAllAction("Show all items "),
                new EditAction("Edit item "),
                new DeleteAction("Delete item "),
                new FindByIdAction("Find item by Id"),
                new FindByNameAction("Find item by Name"),
                new ExitAction("Exit")

        };
        new StartUI().init(validate, tracker, actions);
    }
}