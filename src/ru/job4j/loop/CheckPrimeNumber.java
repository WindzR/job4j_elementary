package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean isSimple = true;
        if (number == 1) {
            isSimple = false;
        }
        for (int i = 2; i <= (int) (Math.sqrt(number)); i++) {
            if (number % i == 0) {
                isSimple = false;
                break;
            }
        }
            return isSimple;
    }
}

