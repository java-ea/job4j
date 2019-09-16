package ru.job4j.tracker;

import java.util.Arrays;

/**
 * Робота с пользователем.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version 0.1
 * @since 15.09.2019
 */
public class StartUI {
    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";
    /**
     * Константа меню для вывода всех заявок в консоль.
     */
    private static final String SHOW_ALL = "1";
    /**
     * Константа меню для редактирования заявки.
     */
    private static final String EDIT = "2";
    /**
     * Константа меню для удаления заявки.
     */
    private static final String DELETE = "3";
    /**
     * Константа меню для поиска заявки по ID.
     */
    private static final String FIND_BY_ID = "4";
    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String FIND_BY_NAME = "5";
    /**
     * Константа меню для поиска заявки по имени.
     */
    private static final String EXIT = "6";
    /**
     * Получение данных от пользователя.
     */
    private final Input input;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */
    private StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
     */
    private void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOW_ALL.equals(answer)) {
                this.findAll();
            } else if (EDIT.equals(answer)) {
                this.edit();
            } else if (DELETE.equals(answer)) {
                this.delete();
            } else if (FIND_BY_ID.equals(answer)) {
                this.findByID();
            } else if (FIND_BY_NAME.equals(answer)) {
                this.findByName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        Item item = new Item(name);
        this.tracker.add(item);
        System.out.println("Новая заявка с getId : " + item.getId() + " ");
    }

    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    private void findAll() {
        System.out.println("------------Все существующие заявки--------------");
        System.out.println(Arrays.toString(this.tracker.findAll()));
    }

    private void edit() {
        System.out.println("------------Редактирования заявки--------------");
        String id = this.input.ask("Введите id заявки :");
        String name = this.input.ask("Введите новое имя заявки :");
        Item tmp = new Item(name);
        if (this.tracker.replace(id, tmp)) {
            tmp.setId(id);
            System.out.println(" Заявка с Id: " + tmp.getId() + " изменена! ");
        } else {
            System.out.println("Заявка с Id: " + id + " не изменина!");
        }
    }

    private void delete() {
        System.out.println("------------Удаления заявки--------------");
        String id = this.input.ask("Введите id заявки :");
        if (this.tracker.delete(id)) {
            System.out.println(" Заявка с Id : " + id + " удалена!");
        } else {
            System.out.println("Заявка с номером " + id + " не удалена!");
        }
    }

    private void findByID() {
        System.out.println("------------Поиск заявки--------------");
        String id = this.input.ask("Введите id заявки :");
        Item tmp = this.tracker.findById(id);
        if (tmp != null) {
            System.out.println("Заявка найдена.");
            System.out.println(tmp);
            System.out.println("--------------------------------------------------------");
        } else {
            System.out.println("Заявка с id" + id + " не найдена!");
            System.out.println("--------------------------------------------------------");
        }
    }

    private void findByName() {
        System.out.println("------------Поиск заявки-------------");
        String name = this.input.ask("Введите им'я заявки :");
        Item[] tmp = this.tracker.findByName(name);
        if (tmp != null) {
            System.out.println("Заявка найдена.");
            System.out.println(Arrays.toString(tmp));
            System.out.println("--------------------------------------------------------");
        } else {
            System.out.println("Заявка с именем" + name + " не найдена!");
            System.out.println("--------------------------------------------------------");
        }
    }

    /**
     * Запускт программы.
     *
     * @param args agrs.
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}