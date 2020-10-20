package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean temp = left > right;
        int result = temp ? left : right;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Выводим большее значение из двух: " + max(5, 8));
        System.out.println("Выводим большее значение из двух: " + max(7, 3));
        System.out.println("Выводим большее значение из двух: " + max(-10, -5));
        System.out.println("Выводим большее значение из двух: " + max(3, 3));
    }
}
