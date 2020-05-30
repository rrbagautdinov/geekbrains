package ru.geekbrains.lessons.lesson1;

public class MainApp {
    public static void main(String[] args) {
        Zadacha8(2001);
    }

    public static void HelloWorld() {
        System.out.println("Hello World!");
    }

    public static void Zadacha2() {
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 200000L;
        float e = 12.23f;
        double f = 123.123;
        char g = '\u2242';
        boolean h = true;
    }

    public static void Zadacha3(int a, int b, int c, int d) {
        int result = (a * (b + (c / d)));
        System.out.println(result);
    }

    public static boolean Zadacha4(int a, int b) {
        int result = a + b;
        if (result >= 10 && result <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void Zadacha5(int a) {
        if (a >= 0) {
            System.out.println("Это положительное число");
        } else {
            System.out.println("Это отрицательное число");
        }
    }

    public static boolean Zadacha6(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void Zadacha7(String a) {
        System.out.println("«Привет, " + a + "!»");
    }

    public static void Zadacha8(int year) {
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            System.out.println("Это обычный год");
        } else {
            System.out.println("Это високосный год");
        }
    }

}
