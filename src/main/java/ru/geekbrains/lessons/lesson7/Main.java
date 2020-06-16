package ru.geekbrains.lessons.lesson7;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 16, false);
        Plate plate1 = new Plate("Миска желтая", 12);
        plate1.info();
        cat1.eat(plate1);
        System.out.println();

        Cat cat2 = new Cat("Васька", 10, false);
        Plate plate2 = new Plate("Миска красная", 12);
        plate2.info();
        cat2.eat(plate2);
        System.out.println();

        Plate plate3 = new Plate("Миска зеленая", 10);
        plate3.info();
        plate3.addCapacity();
        plate3.info();
        System.out.println();

        Cat[] cats = new Cat[5];
        Plate plate4 = new Plate("Огромная миска для котов", 100);
        cats[0] = new Cat("Кот1", 24, false);
        cats[1] = new Cat("Кот2", 10, false);
        cats[2] = new Cat("Кот3", 15, false);
        cats[3] = new Cat("Кот4", 30, false);
        cats[4] = new Cat("Кот5", 27, false);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate4);
            plate4.info();
            System.out.println();
        }
    }
}