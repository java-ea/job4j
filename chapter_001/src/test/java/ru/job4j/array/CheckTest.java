package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * CheckTest.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version 0.1
 * @since 23.08.2019
 */
public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[]{true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
    @Test
    public void when3True1FalseThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[]{true, true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
    @Test
    public void when4True1FalseThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[]{false, true, true, true,true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void when3True2FalseThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[]{true, false, true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}