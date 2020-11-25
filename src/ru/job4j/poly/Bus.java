package ru.job4j.poly;

import java.util.Random;

public class Bus implements Transport {
    @Override
    public void go() {
        Bus bus = new Bus();
        Random pass = new Random();
        bus.passengers(pass.nextInt(100));
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("Количество перевезенных пассажиров составило: " + passengers);
    }

    @Override
    public double refuel(double fuel) {
        return -1;
    }
}
