package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distanceTo(){
    double is = Point.distance(1,1,1,3);
    double expected = 2;
        Assert.assertEquals(expected,is,0.1);
    }
}
