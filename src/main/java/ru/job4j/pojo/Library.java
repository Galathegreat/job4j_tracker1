package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Novel", 20);
        books[1] = new Book("Marvel", 30);
        books[2] = new Book("Detective", 10);
        books[3] = new Book("Clean Code", 35);
        for (Book pr : books) {
            System.out.println(pr.getName() + " количество страниц:" + pr.getPages());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (Book pr : books) {
            System.out.println(pr.getName() + "количество страниц:" + pr.getPages());
        }
        System.out.println();
        for (Book pr : books) {
            if ("Clean code".equals(pr.getName())) {
                System.out.println(pr.getName() + "количество страниц:" + pr.getPages());
            }
        }
    }
}




