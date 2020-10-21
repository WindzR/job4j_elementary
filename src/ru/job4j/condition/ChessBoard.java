package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            return Math.abs(x2 - x1);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Слон переместился на: " + way(0, 0, 5, 5) + " ходов.");
        System.out.println("Слон переместился на: " + way(0, 0, 3, 5) + " ходов.");
        System.out.println("Слон переместился на: " + way(7, 0, 0, 7) + " ходов.");
        System.out.println("Слон переместился на: " + way(2, 1, 7, 7) + " ходов.");
    }
}
