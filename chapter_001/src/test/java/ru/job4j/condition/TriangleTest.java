package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;


public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        // Создаем объект треугольник.
        Point first = new Point(0, 0);
        Point second = new Point(0, 3);
        Point third = new Point(3, 0);
        Triangle triangle = new Triangle(first, second, third);
        // Вычисляем площадь.
        double result = triangle.area();
        // Задаем ожидаемый результат.
        double expected = 4.5;
        //Проверяем результат и ожидаемое значение.
        assertThat(result, closeTo(expected, 0.1));
    }
}