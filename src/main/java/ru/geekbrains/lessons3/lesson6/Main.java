package ru.geekbrains.lessons3.lesson6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1(new int[]{1, 4, 3, 2, 4, 6, 4, 8, 9, 10});
        task2(new int[]{1, 4, 1, 4, 1, 4});
    }

    public static int[] task1(int[] massive) {
        int findFour = 0;
        int lastFour = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == 4) {
                findFour++;
            }
        }
        if (findFour == 0) {
            throw new RuntimeException();
        }

        for (int i = massive.length - 1; i >= 0; i--) {
            if (massive[i] == 4) {
                lastFour = i;
                break;
            }
        }

        System.out.println("В массиве найдено четверок: " + findFour + " штуки");
        System.out.println("Индекс последней четверки: " + lastFour);
        System.out.println("Вытаскиваю остаточный массив, после последней четверки");
        int massive2[] = Arrays.copyOfRange(massive, lastFour + 1, massive.length);
        return massive2;
    }

    public static boolean task2(int[] massiv) {
        int countOne = 0;
        int countFour = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] == 1) {
                countOne++;
            } else if( massiv[i] == 4) {
                countFour++;
            }
        }

        if (countOne == 0) {
            return false;
        } else if (countFour == 0) {
            return false;
        } else if (countOne == 0 && countFour == 0) {
            return false;
        } else {
            return true;
        }
    }
}
