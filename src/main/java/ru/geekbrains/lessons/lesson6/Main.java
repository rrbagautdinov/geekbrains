package ru.geekbrains.lessons.lesson6;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Barsik", 200, 2);
        cat.animalInfo();
        System.out.println();

        Animal dog = new Dog("Barbos",500, 0.5, 10);
        dog.animalInfo();
        System.out.println();

        Animal dog2 = new Dog("Sharik", 600, 1, 15);
        dog2.animalInfo();
    }
}
