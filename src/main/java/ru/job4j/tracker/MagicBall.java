package ru.job4j.tracker;

import java.util.Scanner;
import java.util.Random;

 public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий оракул. Что ты хочешь узнать?");
        String question = input.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0:
                answer = Integer.parseInt("Да");
                break;
            case 1:
                answer = Integer.parseInt("Нет");
                break;
            default:
                answer = Integer.parseInt("Может быть");
                break;
        }
        System.out.println(answer);
    }
}