package ru.geekbrains.lessons.lesson6;

public abstract class Animal {

    String name;
    int run;
    double jump;
    int swim;

    public Animal(String name, int run, double jump, int swim) {
        this.name = name;
        this.run = run;
        this.jump = jump;
        this.swim = swim;
    }

    public Animal(String name, int run, double jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    public void animalInfo() {

    }

    public void run(int run) {

    }

    public void jump(double jump) {

    }

    public void swim(int run) {

    }
}