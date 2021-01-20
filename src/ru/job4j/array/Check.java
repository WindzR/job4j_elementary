package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] array) {
        boolean isMono = true;
        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] != array[i + 1]) {
                isMono = false;
                break;
            }
        }
        return isMono;
    }
}
