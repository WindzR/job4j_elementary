package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int element = -1;
        int[] temp = new int[data.length];
        for (int index = 0; index < data.length; index++) {
            temp[index] = data[index];
            if (temp[index] == el) {
                element = index;
                break;
            }
        }
        return element;

    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int element = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                element = i;
                break;
            }
        }
        return element;
    }
}
