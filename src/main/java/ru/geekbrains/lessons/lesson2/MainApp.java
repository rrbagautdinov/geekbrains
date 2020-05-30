package ru.geekbrains.lessons.lesson2;


public class MainApp {
    public static void main(String[] args) {

    }

        /*
        6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
        если в массиве есть место, в котором сумма левой и правой части массива равны.
        Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
        */

    public static void Zadanie1() {
        int[] massiv = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] == 1) {
                massiv[i]--;
            } else {
                massiv[i]++;
            }
            System.out.print(massiv[i] + " ");
        }
    }

    public static void Zadanie2() {
        int[] massiv2 = new int[8];
        for (int i = 0; i < massiv2.length; i++) {
            for (int j = 0; j < i; j++) {
                massiv2[i] += 3;
            }
            System.out.print(massiv2[i] + " ");
        }
    }

    public static void Zadanie3() {
        int[] massiv3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < massiv3.length; i++) {
            if (massiv3[i] < 6) {
                massiv3[i] *= 2;
            }
            System.out.print(massiv3[i] + " ");
        }
    }

    public static void Zadanie4() {
// не смог сделать так, чтобы заполнилась 2ая диагональ
        int[][] massiv4 = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                massiv4[i][i] = 1;
                System.out.print(" " + massiv4[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Zadanie5() {
        int[] massiv5 = {3, 76, 23, 12, 64, 2, 6, 7, 8};
        int minValue = massiv5[0];
        int maxValue = massiv5[0];

        for (int i = 0; i < massiv5.length; i++) {
            if (massiv5[i] < minValue) {
                minValue = massiv5[i];
            }
        }

        for (int j = 0; j < massiv5.length; j++) {
            if (massiv5[j] > maxValue) {
                maxValue = massiv5[j];
            }
        }
        System.out.println("Минимальное значение: " + minValue);
        System.out.println("Максимальное значение значение: " + maxValue);
    }

    public static void Zadanie6() { //int[] massiv6
        int[] massiv6 = {2, 1, 1, 3};
        //Zadanie6(new int[]{5, 4, 3, 8, 1, 1, 2});
        int leftsum = 0;
        int rightsum = 0;
        int sum = 0;
        for (int selector = 0; selector < massiv6.length; selector++) {
            int selector_position = massiv6[selector];
            System.out.println(selector_position);
        }

    }

    public static void Zadanie7(int[] massiv7, int n) {
        /*
        7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
        * при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        */
        for (int i = 0; i < massiv7[n]; n++) {

        }
    }
}
