package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenExisttrue() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenExistfalse() {
        boolean result = Triangle.exist(1.0, 6.0, 4.0);
        assertThat(result, is(false));
    }

    @Test
    public void whenExistfalse2() {
        boolean result = Triangle.exist(15.0, 28.0, 11.0);
        assertThat(result, is(false));
    }
}