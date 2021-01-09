package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftNums = left.split(". ");
        String[] rightNums = right.split(". ");
        int numberLeft = Integer.parseInt(leftNums[0]);
        int numberRight = Integer.parseInt(rightNums[0]);
        return Integer.compare(numberLeft, numberRight);
    }
}
