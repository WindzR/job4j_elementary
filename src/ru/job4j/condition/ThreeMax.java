package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = third;
        if (first >= second && first >= third) {
            result = first;
        }
        if (second >= first && second >= third) {
            result = second;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Максимальное число: " + max(1, 2, 3));
        System.out.println("Максимальное число: " + max(3, 2, 1));
        System.out.println("Максимальное число: " + max(1, 3, 2));
    }
}
