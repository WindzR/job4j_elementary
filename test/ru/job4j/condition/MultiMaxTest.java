package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenMax1To2to3Then3() {
        int result = MultiMax.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax3To1to3Then3() {
        int result = MultiMax.max(3, 1, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax1To3to3Then3() {
        int result = MultiMax.max(1, 3, 3);
        assertThat(result, is(3));
    }
}