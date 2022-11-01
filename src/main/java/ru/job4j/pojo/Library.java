package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Novel", 20);
        Book second = new Book("Marvel", 30);
        Book third = new Book("Detective", 10);
        Book fourth = new Book("Clean Code", 35);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;
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
            if (pr.getName().equals("Clean code")) {
                System.out.println(pr.getName() + "количество страниц:" + pr.getPages());
            }
        }
    }
}
