package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * FindLoopTest.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHaveNot7ThenMinus1() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{1, 10, 3};
        int value = 7;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas2From2To5Then3() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3, 2, 1, 6};
        int value = 2;
        int start = 2;
        int finish = 5;
        int result = find.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHasNot2From2To5ThenMinus1() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 2, 3, 10, 1, 6};
        int value = 2;
        int start = 2;
        int finish = 5;
        int result = find.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort5() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = find.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {3, 1, 2};
        int[] result = find.sort(input);
        int[] expect = new int[] {1, 2, 3};
        assertThat(result, is(expect));
    }

}
