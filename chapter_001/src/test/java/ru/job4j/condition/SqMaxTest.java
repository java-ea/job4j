package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqMaxTest {
    @Test
    public void maxIs1() {
        int expected = 5;
        int max = SqMax.max(5, 4, 2, 1);
        assertThat(max, is(expected));
    }

    @Test
    public void maxIs2() {
        int expected = 10;
        int max = SqMax.max(5, 10, 2, 1);
        assertThat(max, is(expected));
    }

    @Test
    public void maxIs3() {
        int expected = 10;
        int max = SqMax.max(5, 4, 10, 1);
        assertThat(max, is(expected));
    }

    @Test
    public void maxIs4() {
        int expected = 10;
        int max = SqMax.max(5, 4, 1, 10);
        assertThat(max, is(expected));
    }
}
