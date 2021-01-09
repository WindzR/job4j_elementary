package ru.job4j.collection;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;
import java.util.Arrays;

public class LexSortTest {

    @Test
    public void sortNum1and2and10() {
        String[] input = {
                "10. Task.",
                "1. Task.",
                "2. Task."
        };
        String[] out = {
                "1. Task.",
                "2. Task.",
                "10. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }

    @Test
    public void sortNum5and33and111() {
        String[] input = {
                "111. Goes.",
                "33. Saw.",
                "5. Won."
        };
        String[] out = {
                "5. Won.",
                "33. Saw.",
                "111. Goes."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }
}