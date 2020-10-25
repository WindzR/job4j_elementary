package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean isEqual = true;
        boolean isLonger = word.length >= pref.length;
        int arrayLength = isLonger ? pref.length : word.length;
        for (int i = 0; i < arrayLength; i++) {
            if (word[i] != pref[i]) {
                isEqual = false;
                break;
            }
        }
        return isEqual;
    }
}
