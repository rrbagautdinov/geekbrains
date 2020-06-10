package ru.geekbrains.lessons.lesson6;

public class Cat extends Animal {

    public Cat(String name, int run, double jump) {
        super(name, run, jump);
    }

    @Override
    public void animalInfo() {
        System.out.println("name: " + name + " run: " + run + " jump: " + jump);
    }
}