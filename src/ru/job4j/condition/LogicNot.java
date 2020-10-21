package ru.job4j.condition;

public class LogicNot {
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !(num % 2 == 0);
    }

    public static boolean notPositive(int num) {
        return !(num > 0);
    }

    public static boolean notEvenAndPositive(int num) {
        return (num % 2 != 0 && !(num <= 0));
    }

    public static boolean evenOrNotPositive(int num) {
        return !(num % 2 != 0 || num > 0);
    }

    public static void main(String[] args) {
        System.out.println(notEven(5));
        System.out.println(notPositive(-2));
        System.out.println(notEvenAndPositive(5));
        System.out.println(evenOrNotPositive(-4));
    }
}
