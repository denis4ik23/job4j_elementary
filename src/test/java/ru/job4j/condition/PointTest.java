package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        double expected = 2;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

   @Test
    public void when10to20then1() {
        Point first = new Point(1, 0);
        Point second = new Point(2, 0);
        double expected = 1;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to20then1point41() {
        Point first = new Point(1, 1);
        Point second = new Point(2, 0);
        double expected = 1.41;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when31to21then1() {
        Point first = new Point(3, 1);
        Point second = new Point(2, 1);
        double expected = 1;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}