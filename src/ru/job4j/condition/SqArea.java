package ru.job4j.condition;

public class SqArea {

    public static double square(int p, int k) {
        double ps = (double) p;
        double ks = (double) k;
        double h = ps / (2 * (ks + 1));
        double l = h * ks;
        return l * h;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);

        double result2 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = " + result2);
    }
}
