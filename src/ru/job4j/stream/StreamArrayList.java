package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamArrayList {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            boolean isPositiv = r.nextBoolean();
            Integer number = isPositiv ? r.nextInt(100) : -1 * r.nextInt(100);
            data.add(number);
        }
        System.out.println(data);
        List<Integer> positive = data.stream().filter(
                num -> num > 0
        ).collect(Collectors.toList());
        System.out.println(positive);
    }
}
