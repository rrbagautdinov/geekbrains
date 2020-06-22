package ru.geekbrains.lessons2.lesson1;

public class Human {
    private int run;
    private double jump;

    public Human(int run, double jump) {
        this.run = run;
        this.jump = jump;
    }

    public void Run(Treadmill tr) {
        System.out.println("Человек пробует пробежать...");
        if (run >= tr.getTreadmill_lenght()) {
            System.out.println("Человек успешно пробежал длинну: " + tr.getTreadmill_lenght() + " метров");
        } else {
            System.out.println("Человек не смог пробежать длинну: " + tr.getTreadmill_lenght() + " метров");
        }
    }

    public void Jump(Wall wl) {
        System.out.println("Человек пробует прыгнуть...");
        if (jump >= wl.getWall_height()) {
            System.out.println("Человек успешно прыгнул на : " + wl.getWall_height() + " метров");
        } else {
            System.out.println("Человек не смог прыгнуть на: " + wl.getWall_height() + " метров");
        }
    }
}
