package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();
        students.put("bodin.dmitry@yandex.ru", "Bodin Dmitry Alexandrovich");
        students.put("komolov.andrey@yandex.ru", "Komolov Andrey Vladimirovich");
        for (String key : students.keySet()) {
            String name = students.get(key);
            System.out.println(key + " = " + name);
        }
    }
}
