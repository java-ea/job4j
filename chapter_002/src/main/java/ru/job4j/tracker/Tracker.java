package ru.job4j.tracker;

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
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавляет заявки в хранилище.
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
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
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getId().equals(id)) {
                tmp = items[i];
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
    public Item[] findByName(String key) {
        Item[] tmp = new Item[this.position];
        int count = 0;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getName().equals(key)) {
                tmp[count] = this.items[i];
                count++;
            }
        }
        Item[] result = new Item[count];
        System.arraycopy(tmp, 0, result, 0, count);
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
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getId().equals(id)) {
                this.items[i] = item;
                tmp = true;
            }

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
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getId().equals(id)) {
                System.arraycopy(this.items, i + 1, this.items, i, items.length - (i + 1));
                position--;
                tmp = true;
                break;
            }
        }
        return tmp;
    }

    /**
     * Находит все созданые заявки.
     *
     * @return массив заявок.
     */
    public Item[] findAll() {
        Item[] items1 = new Item[this.position];
        System.arraycopy(this.items, 0, items1, 0, position);
        return items1;
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