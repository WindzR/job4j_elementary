package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int amount = 0;
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                amount = amount + array[row][cell];
            }
        }
        return amount;
    }
}
