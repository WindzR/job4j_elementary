package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет по дороге.");
    }

    @Override
    public void payload(double load) {
        System.out.println(getClass().getSimpleName() + " перевозит " + load + " пассажиров на небольшие расстояния.");
    }
}
