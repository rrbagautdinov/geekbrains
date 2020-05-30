package ru.geekbrains.lessons.lesson3;

import java.util.Scanner;

public class Game2 {

    private static String systemString;
    private static String secureString;

    public static void main(String[] args) {
        massiv();
        info();
        scanner();
    }

    public static String massiv() {
        String[] words = {
                "apple",
                "orange",
                "lemon",
                "banana",
                "apricot",
                "avocado",
                "broccoli",
                "carrot",
                "cherry",
                "garlic",
                "grape",
                "melon",
                "leak",
                "kiwi",
                "mango",
                "mushroom",
                "nut",
                "olive",
                "pea",
                "peanut",
                "pear",
                "pepper",
                "pineapple",
                "pumpkin",
                "potato"
        };

        int systemindex = (int) Math.floor((Math.random() * words.length));
        System.out.println("###############");
        systemString = words[systemindex];
        secureString = words[systemindex].substring(0, 2) + "#############";
        return systemString;
    }

    public static void info() {
        System.out.println();
        System.out.println("Игра угадай слово");
        System.out.println("Я загадал слово");
        System.out.println("Введи с клавиатуры: ");
    }

    public static void scanner() {
        Scanner scanner = new Scanner(System.in);
        String userstring = scanner.nextLine();

        if (userstring.equals(systemString)) {
            System.out.println("Вы угадали слово!");
        } else {
            System.out.println("Вы не угадали слово! Попробуйте еще раз!");
            System.out.println("Подсказка: " + secureString);
            System.out.println("Введите слово: ");
            scanner();
        }
        System.out.println();
    }
}
