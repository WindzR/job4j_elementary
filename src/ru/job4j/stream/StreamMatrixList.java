package ru.job4j.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMatrixList {

    public Integer[][] generateMatrix(int size) {
        Random random = new Random();
        Integer[][]matrix = new Integer[size][size];
        for (int i = 0; i < size; i++) {
            System.out.print("{ ");
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(100);
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println("},");
        }
        return matrix;
    }

    public static void main(String[] args) {
        StreamMatrixList test = new StreamMatrixList();
        Integer[][]matrix = test.generateMatrix(5);
        List<Integer> integers = Arrays.stream(matrix)
                .flatMap(Arrays :: stream)
                .collect(Collectors.toList());
        System.out.println(integers);
    }
}
