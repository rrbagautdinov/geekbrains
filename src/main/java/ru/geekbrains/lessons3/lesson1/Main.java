package ru.geekbrains.lessons3.lesson1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static String[] smass;

    public static void main(String[] args) {
        smass = new String[] {
                "a", "b", "c", "d", "e", "j"
        };
        fillArray(smass);
        info();
        changeItems(smass, 5, 0);
        info();
        arrayToArrayList();

    }

    public static void changeItems(String[] smass, int first, int second) throws ArrayIndexOutOfBoundsException {
        try {
            String temp = smass[second];
            String temp2 = smass[first];
            smass[first] = temp;
            smass[second] = temp2;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public static void fillArray(String[] smass) {
        for (int i = 0, j = 0; i < smass.length; i++) {
            smass[i] = "a" + j++;
        }
    }

    public static void info() {
        String intArrayString = Arrays.toString(smass);
        System.out.println(intArrayString);
    }

    public static void arrayToArrayList() {
        List<String> list = Arrays.asList(smass);
        System.out.println(list);
    }

}
