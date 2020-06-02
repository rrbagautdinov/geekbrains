package ru.geekbrains.lessons.lesson3;

import java.util.Scanner;

public class Game1 {

    private static int random;

    public static void main(String[] args) {
        randomizer(0, 9);
        info();
        core();
        reloadgame();
    }

    public static void info() {
        System.out.println();
        System.out.println("Система загадала случайное число от 0 до 9");
        System.out.println("У вас есть 3 попытки, чтобы угадать это число");
        System.out.println("Введите число: ");
    }

    public static int randomizer(int a, int b) {
        random = a + (int) (Math.random() * b);
        System.out.println(random);
        return random;
    }

    public static void core() {
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            int user_number = scanner.nextInt();
            if (random == user_number) {
                System.out.println("Вы угадали!");
                System.out.println("Вы выиграли!");
                reloadgame();
            } else {
                System.out.println("Вы не угадали!");
            }
        }
        System.out.println();
        System.out.println("Вы проиграли!");
    }

    public static void reloadgame() {
        System.out.println();
        System.out.println("Чтобы сыграть еще раз, введите цифру 1");
        System.out.println("Чтобы выйти, введите цифру 0");
        Scanner scanner2 = new Scanner(System.in);
        int user_choice = scanner2.nextInt();
        if (user_choice == 1) {
            randomizer(0, 9);
            info();
            core();
            reloadgame();
        } else {
            scanner2.close();
        }
    }
}
