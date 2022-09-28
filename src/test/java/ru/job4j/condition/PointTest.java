package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to11then1dot0() {
        double expected = 1.0;
        Point a = new Point(0, 1);
        Point b = new Point(1, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when102to12then9dot0() {
        double expected = 9.0;
        Point a = new Point(10, 2);
        Point b = new Point(1, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when101to101then0dot0() {
        double expected = 0.0;
        Point a = new Point(10, 1);
        Point b = new Point(10, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}