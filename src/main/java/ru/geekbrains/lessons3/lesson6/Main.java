package ru.geekbrains.lessons3.lesson6;

public class Main {
    public static void main(String[] args) {
        lesson1(new int[]{1, 4, 3, 4, 5, 6, 4, 8, 9, 10});
    }

    public static void lesson1(int[] massive) {
        for (int i = 0; i < massive.length; i++) {
            System.out.println(massive[i]);
        }
    }
}
