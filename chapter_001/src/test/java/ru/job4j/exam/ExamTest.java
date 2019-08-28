package ru.job4j.exam;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * ExamTest.
 *
 * @author Pavlo Stefiniv (stefiniv4w@gmail.com)
 * @version 0.1
 * @since 28.08.2019
 */
public class ExamTest {
    @Test
    public void whenMarge2Arrays() {
        Exam exam = new Exam();
        int[] a = new int[]{1, 3};
        int[] b = new int[]{2, 4};
        int[] result = exam.merge(a, b);
        int[] expected = new int[]{1, 2, 3, 4};
        assertThat(result, is(expected));
    }

    @Test
    public void whenMarge2Arrays2() {
        Exam exam = new Exam();
        int[] first = new int[]{1, 3, 6, 8};
        int[] second = new int[]{2, 4, 5, 7};
        int[] result = exam.merge(first, second);
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        assertThat(result, is(expected));
    }


}
