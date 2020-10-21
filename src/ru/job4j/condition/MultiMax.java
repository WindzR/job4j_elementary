package ru.job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int third) {
        boolean temp = first > second;
        if (temp) {
            int result = temp ? first : third;
            return result;
        } else {
            boolean temp2 = second > third;
            int result = temp2 ? second : third;
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println("Максимальное число: " + max(1, 2, 3));
        System.out.println("Максимальное число: " + max(3, 2, 1));
        System.out.println("Максимальное число: " + max(1, 3, 2));
    }
}
