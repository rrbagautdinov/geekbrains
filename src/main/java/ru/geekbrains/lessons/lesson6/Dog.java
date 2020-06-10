package ru.geekbrains.lessons.lesson6;

public class Dog extends Animal {

    public Dog(String name, int run, double jump, int swim) {
        super(name, run, jump, swim);
    }

    @Override
    public void animalInfo() {
        System.out.println("name: " + name + " run: " + run + " jump: " + jump + " swim: " + swim);
    }
}