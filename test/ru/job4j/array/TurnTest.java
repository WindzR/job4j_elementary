package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithNotEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {5, 4, 3, 2, 1};
        int[] result = turner.back(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWith6ElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {9, 8, 7, 6, 5, 4};
        int[] result = turner.back(input);
        int[] expect = new int[] {4, 5, 6, 7, 8, 9};
        assertThat(result, is(expect));
    }
}