package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void squareArea1() {
        int is = SqArea.square(4, 1);
        int expected = 1;
        Assert.assertEquals(expected, is);
    }

    @Test
    public void squareArea2() {
        int is = SqArea.square(6, 2);
        int expected = 2;
        Assert.assertEquals(expected, is);
    }

}
