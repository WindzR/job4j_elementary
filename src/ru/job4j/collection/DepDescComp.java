package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String first, String second) {
        String[] firstLex = first.split("/");
        String[] secondLex = second.split("/");
        int rsl = secondLex[0].compareTo(firstLex[0]);
        int compare = rsl == 0 ? first.compareTo(second) : rsl;
        return compare;
    }
}
