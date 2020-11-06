package ru.job4j.oop;

import org.junit.Test;
import org.junit.Assert;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void when00to50then5() {
        Point a = new Point(0, 0);
        Point b = new Point(5, 0);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(5, 0.01));
    }

    @Test
    public void when000to500then5() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(5, 0, 0);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(5, 0.01));
    }

    @Test
    public void when000to444then5() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(4, 4, 4);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(6.928, 0.01));
    }
}