package ru.geekbrains.lessons2.lesson1;

public class Robot {
    private int run;
    private double jump;

    public Robot(int run, double jump) {
        this.run = run;
        this.jump = jump;
    }

    public void Run(Treadmill tr) {
        System.out.println("Робот пробует пробежать...");
        if (run >= tr.getTreadmill_lenght()) {
            System.out.println("Робот успешно пробежал длинну: " + tr.getTreadmill_lenght() + " метров");
        } else {
            System.out.println("Робот не смог пробежать длинну: " + tr.getTreadmill_lenght() + " метров");
        }
    }

    public void Jump(Wall wl) {
        System.out.println("Робот пробует прыгнуть...");
        if (jump >= wl.getWall_height()) {
            System.out.println("Робот успешно прыгнул на : " + wl.getWall_height() + " метров");
        } else {
            System.out.println("Робот не смог прыгнуть на: " + wl.getWall_height() + " метров");
        }
    }
}
