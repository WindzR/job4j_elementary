package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean rsl = true;
        String[] originText = origin.split("[,;:.!?\\s]+");
        String[] duplicate = line.split(" ");
        HashSet<String> test = new HashSet<>();
        test.addAll(Arrays.asList(originText));
        for (String word : duplicate) {
            if (!test.contains(word)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Article article = new Article();
        boolean test = generateBy("Мой дядя самых честных правил, "
                        + "Когда не в шутку занемог, "
                        + "Он уважать себя заставил "
                        + "И лучше выдумать не мог. "
                        + "Его пример другим наука; "
                        + "Но, боже мой, какая скука "
                        + "С больным сидеть и день и ночь, "
                        + "Не отходя ни шагу прочь! "
                        + "Какое низкое коварство "
                        + "Полуживого забавлять, "
                        + "Ему подушки поправлять, "
                        + "Печально подносить лекарство, "
                        + "Вздыхать и думать про себя: "
                        + "Когда же черт возьмет тебя!",
                "Мой дядя мог думать про тебя и день и ночь");
        System.out.println(test);
    }
}
