package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    private final int MATCHES = 11;

    public static void main(String[] args) {
        Matches game = new Matches();
        game.go();
    }

    public void go() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Вас приветствует лучшая игра для альтернативно-одаренных,  ");
            System.out.println("О Д И Н А Д Ц А Т Ь !!!");
            Thread.sleep(1000);
            System.out.println("На столе 11 спичек! Вы можете убрать от 1 до 3 спичек! ");
            int matches = MATCHES;
            boolean flag = false;
            int turn = 0;
            while (matches > 0) {
                turn++;
                if (turn % 2 == 0) {
                    System.out.println("Ход игрока Бивис. ");
                    flag = true;
                } else {
                    System.out.println("Ход игрока Батхед. ");
                    flag = false;
                }
                int select = Integer.parseInt(input.nextLine());
                matches = matches - select;
                System.out.println("На столе осталось " + matches + " спичек(чка)! ");
            }
            if (flag) {
                System.out.println("Выиграл игру игрок Бивис! ");
            } else {
                System.out.println("Выиграл игру игрок Батхед! ");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
