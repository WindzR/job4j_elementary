package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Hare zayac = new Hare();
        Wolf volk = new Wolf();
        Fox lisa = new Fox();
        Ball kolobok = new Ball();
        zayac.tryEat(kolobok);
        kolobok.go();
        volk.tryEat(kolobok);
        kolobok.go();
        lisa.tryEat(kolobok);
        kolobok.fail(lisa);
    }
}
