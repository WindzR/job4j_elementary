package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int charge) {
        this.load = charge;
    }

    public Battery() {
        this.load = 100;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(100);
        Battery second = new Battery(50);
        System.out.println("Заряд первой батареи -> " + first.load + ". Заряд второй батареи -> " + second.load);
        first.exchange(second);
        System.out.println("Заряд первой батареи -> " + first.load + ". Заряд второй батареи -> " + second.load);

    }
}
