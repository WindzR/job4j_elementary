package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

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

    public List<Integer> arrayToList(Integer[][] matrix) {
        return Arrays.stream(matrix)
                .flatMap(Arrays :: stream)
                .collect(Collectors.toList());
    }
}
