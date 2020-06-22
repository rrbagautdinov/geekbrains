package ru.geekbrains.lessons2.lesson1;

public class Main {
    public static void main(String[] args) {

        Wall wall = new Wall(2);
        Treadmill treadmill = new Treadmill(1000);

        Human human = new Human(1500, 1);
        human.Run(treadmill);
        human.Jump(wall);
        System.out.println();

        Robot robot = new Robot(500, 0);
        robot.Run(treadmill);
        robot.Jump(wall);
        System.out.println();

        Cat cat = new Cat(150, 2);
        cat.Run(treadmill);
        cat.Jump(wall);
        System.out.println();

    }
}
