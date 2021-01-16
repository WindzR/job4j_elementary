package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String first, String second) {
        String[] firstLex = first.split("/");
        String[] secondLex = second.split("/");
        int rslLength = Math.min(firstLex.length, secondLex.length);
        for (int i = 0; i < rslLength; i++) {
            int rsl = firstLex[i].compareTo(secondLex[i]);
            if (rsl != 0) {
                return rsl;
            }
        }
        return Integer.compare(firstLex.length, secondLex.length);
    }
}
