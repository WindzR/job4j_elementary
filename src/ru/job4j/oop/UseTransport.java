package ru.job4j.oop;

public class UseTransport {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle bus2 = new Bus();
        Vehicle plane = new Airplane();
        Vehicle plane2 = new Airplane();
        Vehicle train = new Train();
        Vehicle train2 = new Train();

        Vehicle[] vehicles = new Vehicle[]{bus, bus2, plane, plane2, train, train2};
        for (Vehicle i : vehicles) {
            double x = 1;
            i.move();
            i.payload(x * 100);
        }
    }
}
