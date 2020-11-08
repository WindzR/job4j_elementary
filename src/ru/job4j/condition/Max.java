package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean temp = left > right;
        return temp ? left : right;
    }

    public static int max(int first, int second, int third) {
        boolean temp = first > max(second, third);
        return temp ? first : max(second, third);
    }

    public static int max(int first, int second, int third, int forth) {
        return max(first, max(second, max(third, forth)));
    }

    public static void main(String[] args) {
        System.out.println("Выводим большее значение из двух: " + max(5, 8));
        System.out.println("Выводим большее значение из двух: " + max(7, 3));
        System.out.println("Выводим большее значение из трех: " + max(-10, -5, 5));
        System.out.println("Выводим большее значение из четырех: " + max(3, 3, 7, 12));
    }
}
