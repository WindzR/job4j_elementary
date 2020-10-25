package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean isEqual = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                isEqual = false;
                break;
            }
        }
        return isEqual;
    }
}
