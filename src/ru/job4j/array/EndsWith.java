package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean isEqual = true;
        for (int i = 0; i < post.length; i++) {
            if (post[post.length - 1 - i] != word[word.length - 1 - i]) {
                isEqual = false;
                break;
            }
        }
        return isEqual;
    }
}
