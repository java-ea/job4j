package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Random;

/**
 * Робота с заявками.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version 0.1
 * @since 11.09.2019
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final ArrayList<Item> items = new ArrayList<Item>();


    /**
     * Метод добавляет заявки в хранилище.
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items.add(item);
        return item;
    }

    /**
     * Метод поиска заявок в хранилище по id.
     *
     * @param id id заявки.
     * @return найденую заявку, или null если ее нет.
     */
    public Item findById(String id) {
        Item tmp = null;
        for (Item item : this.items) {
            if (item.getId().equals(id)) {
                tmp = item;
                break;
            }
        }
        return tmp;
    }

    /**
     * Метод поиска заявок в хранилище по имени.
     *
     * @param key им'я заявки.
     * @return найдених заявок.
     */
    public ArrayList<Item> findByName(String key) {
        Item tmp = null;
        for (Item item : items) {
            if (item.getName().equals(key)) {
                tmp = item;
                break;
            }
        }
        ArrayList<Item> result = new ArrayList<Item>();
        result.add(tmp);
        return result;
    }

    /**
     * Заменяет найденую по id заявку.
     *
     * @param id   id.
     * @param item заявка.
     * @return true если замена прошла, или false, если нет.
     */
    public boolean replace(String id, Item item) {
        boolean tmp = false;
        int count = 0;
        for (Item i : items) {
            if (i.getId().equals(id)) {
                this.items.set(count, item);
                tmp = true;
                break;
            }
            count++;

        }
        return tmp;
    }

    /**
     * Удаляет найденую по id заявку.
     *
     * @param id id.
     * @return true если удалили, или false, если нет.
     */
    public boolean delete(String id) {
        boolean tmp = false;
        int count = 0;
        for (Item item : items) {
            if (item.getId().equals(id)) {
                items.remove(count);
                tmp = true;
                break;
            }
            count++;
        }
        return tmp;
    }

    /**
     * Находит все созданые заявки.
     *
     * @return массив заявок.
     */
    public ArrayList<Item> findAll() {
        ArrayList<Item> result = new ArrayList<Item>();
        result.addAll(items);
        return result;
    }


    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

}