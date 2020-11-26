package ru.job4j.oop;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летает по воздуху.");
    }

    @Override
    public void payload(double load) {
        System.out.println(getClass().getSimpleName() + " перевозит " + load + " пассажиров и грузы на большой скорости.");
    }
}
