package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Тест класс для проверки метдов класса Tracker.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version 0.1
 * @since 11.09.2019
 */
public class TrackerTest {
    @Test
    public void whenAddItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1");
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2");
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        // Добавляем заявки в трекер.
        Item first = new Item("test1");
        Item second = new Item("test2");
        Item third = new Item("test3");
        // Теперь в объектах проинициализирован id.
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        // Удаляем заявку.
        tracker.delete(second.getId());
        // Проверяем что заявки номер 2 нет.
        Item[] items = tracker.findAll();
        boolean result = true;
        for (Item item : items) {
            if (item.getId().equals(second.getId())) {
                result = false;
                break;
            }
        }
        assertThat(result, is(true));
    }

    @Test
    public void findByName() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1");
        Item second = new Item("test2");
        Item third = new Item("test3");
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        assertThat(tracker.findByName("test2"), is(new Item[]{second}));
    }

    @Test
    public void findById() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1");
        Item second = new Item("test2");
        Item third = new Item("test3");
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        assertThat(tracker.findById(second.getId()), is(second));
    }

    @Test
    public void findAll() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1");
        Item second = new Item("test2");
        Item third = new Item("test3");
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        assertThat(tracker.findAll(), is(new Item[]{first, second, third}));
    }
}
