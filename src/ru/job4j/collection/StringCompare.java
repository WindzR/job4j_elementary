package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        if (right.length() == 0 && left.length() == 0) {
            return 0;
        }
        if (right.length() == 0) {
            return 1;
        }
        boolean compareLength = left.length() < right.length();
        int rslLength = compareLength ? left.length() : right.length();
        for (int i = 0; i < rslLength - 1; i++) {
            int rsl = Character.compare(left.charAt(i), right.charAt(i));
            if (rsl != 0) {
                return rsl;
            }
        }
        if (compareLength) {
            return -1;
        }
        return 0;
    }
}
