package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book headFirst = new Book("Head First Java", 710);
        Book cleanCode = new Book("Clean Code", 460);
        Book thinkingInJava = new Book("Thinking in Java", 1150);
        Book completeGuide = new Book("Java.Complete Guide", 1450);
        Book[] books = new Book[4];
        books[0] = headFirst;
        books[1] = cleanCode;
        books[2] = thinkingInJava;
        books[3] = completeGuide;
        for (Book book : books) {
            System.out.println("Название книги: " + book.getName() + ". Количество страниц - " + book.getCountOfPages());
        }
        System.out.println();
        Book[] temp = new Book[1];
        temp[0] = books[3];
        books[3] = books[0];
        books[0] = temp[0];
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println("Название книги: " + book.getName() + ". Количество страниц - " + book.getCountOfPages());
        }
        System.out.println();
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName().equals("Clean Code")) {
                System.out.println("Название книги: " + book.getName()
                        + ". Количество страниц - " + book.getCountOfPages());
            }
        }
    }
}
