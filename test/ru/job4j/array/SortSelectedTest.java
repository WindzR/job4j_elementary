package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whendata231() {
        int[] input = new int[] {2, 3, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3};
        assertThat(result, is(expect));
    }

    @Test
    public void whendata391216() {
        int[] input = new int[] {3, 9, 12, 1, 6};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 3, 6, 9, 12};
        assertThat(result, is(expect));
    }
}