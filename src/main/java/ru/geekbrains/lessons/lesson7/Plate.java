package ru.geekbrains.lessons.lesson7;
import java.util.Scanner;

public class Plate {
    final private String plate_name;
    private int capacity;
    private int add_capacity;

    public Plate(String plate_name, int capacity) {
        this.plate_name = plate_name;
        this.capacity = capacity;
    }

    public void info() {
        System.out.println("В " + plate_name + " " + capacity + " единиц еды");
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void addCapacity() {
        System.out.println("Сколько единиц еды добавляем?");
        Scanner scanner = new Scanner(System.in);
        add_capacity = scanner.nextInt();
        System.out.println("Добавляем в " + plate_name + " " + add_capacity + " единиц еды");
        setCapacity(getCapacity() + add_capacity);
    }
}