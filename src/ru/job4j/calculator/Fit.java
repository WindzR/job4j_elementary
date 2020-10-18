package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        double man = Fit.manWeight(heightMan);
        System.out.println("Man 187 is " + man + " kg");

        short heightWoman = 170;
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Woman 170 is " + woman + " kg");
    }
}
