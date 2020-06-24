package ru.geekbrains.lessons2.lesson1;

public class Cat {
    private int run;
    private double jump;

    public Cat(int run, double jump) {
        this.run = run;
        this.jump = jump;
    }

    public void Run(Treadmill tr) {
        System.out.println("Кот пробует пробежать...");
        if (run >= tr.getTreadmill_lenght()) {
            System.out.println("Кот успешно пробежал длинну: " + tr.getTreadmill_lenght() + " метров");
        } else {
            System.out.println("Кот не смог пробежать длинну: " + tr.getTreadmill_lenght() + " метров");
        }
    }

    public void Jump(Wall wl) {
        System.out.println("Кот пробует прыгнуть...");
        if (jump >= wl.getWall_height()) {
            System.out.println("Кот успешно прыгнул на : " + wl.getWall_height() + " метров");
        } else {
            System.out.println("Кот не смог прыгнуть на: " + wl.getWall_height() + " метров");
        }
    }
}
