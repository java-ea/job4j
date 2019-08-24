package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * ArrayCharTest.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version 0.2
 * @since 24.08.2019
 */
public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Hello", "He");
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Hello", "Hi");
        assertThat(result, is(false));
    }
    @Test
    public void WhenPrefixIsWordThenTrue() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Hello", "Hello");
        assertThat(result, is(true));
    }
}