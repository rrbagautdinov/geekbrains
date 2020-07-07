package ru.geekbrains.lessons2.lesson5;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        createArrayWithoutThreads(100000);
        createArrayWithThreads(100000);
    }

    public static void createArrayWithoutThreads(int size) {
        System.out.println("Создаем массив из " + size + " элементов на 1 потоке");

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("Программа выполнялась " + timeSpent + " миллисекунд");
        System.out.println();
    }

    public static void createArrayWithThreads(int size) throws InterruptedException {
        System.out.println("Создаем массив из " + size + " элементов на 2 потоках");

        int[] generalArray = new int[size];
        for (int i = 0; i < generalArray.length; i++) {
            generalArray[i] = 1;
        }

        long startTime = System.currentTimeMillis();

        int[] firstArray = Arrays.copyOfRange(generalArray, 0, generalArray.length/2);
        int[] secondArray = Arrays.copyOfRange(generalArray, generalArray.length/2, generalArray.length);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                for (int i = 0; i < firstArray.length; i++) {
                    firstArray[i] = (int)(firstArray[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                for (int i = 0; i < secondArray.length; i++) {
                    secondArray[i] = (int)(secondArray[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        thread2.start();

        thread1.join();
        thread2.join();

        int[] sumArray = new int[firstArray.length + secondArray.length];

        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("Программа выполнялась " + timeSpent + " миллисекунд");
        System.out.println();
    }
}
