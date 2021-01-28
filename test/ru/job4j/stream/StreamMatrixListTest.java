package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class StreamMatrixListTest {

    @Test
    public void arrayToList() {
        StreamMatrixList test = new StreamMatrixList();
        Integer[][]matrix = {{1, 2}, {3, 4}, {5, 6}};
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> actual = test.arrayToList(matrix);
        assertThat(expected, is(actual));
    }
}