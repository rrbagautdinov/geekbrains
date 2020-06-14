package ru.geekbrains.lessons.lesson7;

public class Cat {
    private String cat_name;
    private int appetite;
    private boolean satiety;

    public Cat(String cat_name, int appetite, boolean satiety) {
        this.cat_name = cat_name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        System.out.println("Аппетит кота: " + appetite + " единиц еды");
        System.out.println(cat_name + " кушает...");
        if (appetite > p.getCapacity()) {
            p.setCapacity(appetite - p.getCapacity());
            System.out.println("В тарелке не осталось еды! Кот остался голодным на: " + p.getCapacity() + " единиц еды");
            System.out.println(false);
        } else {
            p.setCapacity(p.getCapacity() - appetite);
            System.out.println("В тарелке осталось: " + p.getCapacity() + " единиц еды");
            System.out.println(true);
        }
    }
}