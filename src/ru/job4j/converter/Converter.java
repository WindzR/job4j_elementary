package ru.job4j.converter;

import org.junit.Test;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(1500);
        System.out.println("1500 rubles are " + dollar + " dollar.");

        //Test rubleToEuro()
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        //Test rubleToDollar()
        int in2 = 1200;
        int expected2 = 20;
        int out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("1200 rubles are 20. Test result : " + passed2);
    }

}
