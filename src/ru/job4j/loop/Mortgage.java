package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double dept = (double) amount;
        while (dept > 0) {
            dept = (percent / 100  + 1) * dept - salary;
            year++;
        }
        return year;
    }
}
