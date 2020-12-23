package ru.job4j.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        int countElem = 0;
        for (int[] value : array) {
            countElem += value.length;
        }
        Integer[] dest = new Integer[countElem];
        int index = 0;
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                dest[index] = array[row][cell];
                index++;
            }
        }
        list = Arrays.asList(dest);
        return list;
    }
}
