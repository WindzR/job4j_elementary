package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int nullIndex = 0;
        for (int index = 0; index < products.length; index++) {
            if (products[index] == null) {
                nullIndex = index;
                break;
            } else {
                nullIndex = -1;
            }
        }
        return nullIndex;
    }
}
