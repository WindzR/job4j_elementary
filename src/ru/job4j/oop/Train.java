package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет по рельсам.");
    }

    @Override
    public void payload(double load) {
        System.out.println(getClass().getSimpleName() + " перевозит " + load + " пассажиров и много груза.");
    }
}
