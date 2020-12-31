package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        // объявляем порядковые элементы в каждом массиве
        int elementLeft = 0;
        int elementRight = 0;
        int elementRsl = 0;
        /*сравниваем последовательно порядковые элементы массивов left и right,
        меньший из них заносим в массив rsl*/
        while (elementLeft < left.length && elementRight < right.length) {
            if (left[elementLeft] < right[elementRight]) {
                rsl[elementRsl++] = left[elementLeft++];
            } else {
                rsl[elementRsl++] = right[elementRight++];
            }
        }
        /*первый while записывает элементы в rsl, если right уже "пуст" ,
        а в left остались элементы, второй while делает то же самое, но для "пустого" left.*/
        while (elementLeft < left.length) {
            rsl[elementRsl++] = left[elementLeft++];
        }
        while (elementRight < right.length) {
            rsl[elementRsl++] = right[elementRight++];
        }

        return rsl;
    }
}
