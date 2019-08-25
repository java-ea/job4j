package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;


public class FitTest {
    @Test
    public void manWeight() {
        double is = 180;
        double expected = 84;
        double out = Fit.manWeight(is);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void womanWeight() {
        double is = 170;
        double expected = 63;
        double out = Fit.womanWeight(is);
        Assert.assertEquals(expected, out, 0.1);
    }
}
