package ru.job4j.oop;

public class Ball {
    public void go() {
        System.out.println("Попытка уклонения...");
        System.out.println("Попытка успешна!");
    }

    public void fail(Fox fox) {
        System.out.println("Попытка уклонения...");
        System.out.println("Попытка провалена - объект ликвидирован!");
    }
}
