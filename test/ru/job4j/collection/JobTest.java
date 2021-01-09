package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

public class JobTest {

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompareDecrPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Third", 3),
                new Job("Second", 2),
                new Job("First", 1),
                new Job("Forth", 4)
        );
        Collections.sort(jobs, new JobDescByPriority());
        assertThat(new int[] {jobs.get(0).getPriority(), jobs.get(1).getPriority(), jobs.get(2).getPriority(),
                jobs.get(3).getPriority()}, is(new int[] {4, 3, 2, 1}));
    }

    @Test
    public void whenCompareIncrPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Third", 3),
                new Job("Second", 2),
                new Job("First", 1),
                new Job("Forth", 4)
        );
        Collections.sort(jobs, new JobIncreaseByPriority());
        assertThat(new int[] {jobs.get(0).getPriority(), jobs.get(1).getPriority(), jobs.get(2).getPriority(),
                jobs.get(3).getPriority()}, is(new int[] {1, 2, 3, 4}));
    }

    @Test
    public void whenCompareIncrByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Third", 3),
                new Job("Second", 2),
                new Job("First", 1),
                new Job("Forth", 4)
        );
        Collections.sort(jobs, new JobIncreaseByName());
        assertThat(new String[] {jobs.get(0).getName(), jobs.get(1).getName(), jobs.get(2).getName(),
                jobs.get(3).getName()}, is(new String[] {"First", "Forth", "Second", "Third"}));
    }

    @Test
    public void whenCompareDecrByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Third", 3),
                new Job("Second", 2),
                new Job("First", 1),
                new Job("Forth", 4)
        );
        Collections.sort(jobs, new JobDescByName());
        assertThat(new String[] {jobs.get(0).getName(), jobs.get(1).getName(), jobs.get(2).getName(),
                jobs.get(3).getName()}, is(new String[] {"Third", "Second", "Forth", "First"}));
    }

    @Test
    public void whenCompatorByPriorityAndName() {
        Comparator<Job> cmpPriorityName = new JobIncreaseByPriority().thenComparing(new JobIncreaseByName());
        int rsl = cmpPriorityName.compare(
                new Job("First", 1),
                new Job("Second", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByDecrNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("First", 1),
                new Job("First", 2)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByIncrNameAndDecrPriority() {
        Comparator<Job> cmpNamePriority = new JobIncreaseByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Second", 1),
                new Job("Second", 2)
        );
        assertThat(rsl, greaterThan(0));
    }
}