package ru.geekbrains.lessons2.lesson2;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        //Задание 1
        String[][] array1 = new String[4][5];
        try {
            Array(array1);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        System.out.println();

        //Задание 2
        int result = 0;
        String[][] array2 = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2d"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
        };

        //Задание 3
        try {
            for (int i = 0, iMax = array2.length; i < iMax; i++) {
                for (int j = 0, jMax = array2[i].length; j < jMax; j++) {
                    result += Integer.parseInt(array2[i][j]);
                }
            }
        } catch (NumberFormatException e) {
            throw new MyArrayDataException(e.getMessage());
        } finally {
            System.out.println(result);
        }

    }

    public static void Array(String[][] array) throws MyArraySizeException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Массив не может быть больше 4х4");
        }
    }
}

