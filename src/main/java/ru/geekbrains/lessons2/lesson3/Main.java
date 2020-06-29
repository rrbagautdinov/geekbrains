package ru.geekbrains.lessons2.lesson3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        List<String> arrAnimalList = new ArrayList<>();
        Map<String, Integer> hmAnimalList = new HashMap<>();

        arrAnimalList.add("Кошка");
        arrAnimalList.add("Собака");
        arrAnimalList.add("Кошка");
        arrAnimalList.add("Енот");
        arrAnimalList.add("Воробей");
        arrAnimalList.add("Пчела");
        arrAnimalList.add("Пчела");
        arrAnimalList.add("Кенгуру");
        arrAnimalList.add("Собака");
        arrAnimalList.add("Пчела");

        for (int i = 0; i < arrAnimalList.size(); i++) {
            String tempAnimal = arrAnimalList.get(i);
            if (!hmAnimalList.containsKey(tempAnimal)) {
                hmAnimalList.put(tempAnimal, 1);
            } else {
                hmAnimalList.put(tempAnimal, hmAnimalList.get(tempAnimal) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : hmAnimalList.entrySet()) {
            System.out.println("Животное = " + entry.getKey() + ", Повторений = " + entry.getValue());
        }
        System.out.println(hmAnimalList);
    }
}



