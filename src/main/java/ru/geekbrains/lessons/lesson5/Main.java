package ru.geekbrains.lessons.lesson5;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker(1, "Багаутдинов Роман Равильевич", "тестировщик", "mail@mail.ru", "+79999996666", 100000, 26);
        worker.info();
        System.out.println();
        System.out.println("Вывести работников, чей возраст старше 40 лет:");
        System.out.println();

        Worker[] workers = new Worker[5];
        workers[0] = new Worker(2, "Багаутдинов Роман Равильевич", "тестировщик", "mail@mail.ru", "+79999996666", 100000, 41);
        workers[1] = new Worker(3, "Багаутдинов Роман Равильевич", "тестировщик", "mail@mail.ru", "+79999996666", 100000, 35);
        workers[2] = new Worker(4, "Багаутдинов Роман Равильевич", "тестировщик", "mail@mail.ru", "+79999996666", 100000, 50);
        workers[3] = new Worker(5, "Багаутдинов Роман Равильевич", "тестировщик", "mail@mail.ru", "+79999996666", 100000, 60);
        workers[4] = new Worker(6, "Багаутдинов Роман Равильевич", "тестировщик", "mail@mail.ru", "+79999996666", 100000, 20);

        for (int i = 0; i < workers.length; i++) {
            if (workers[i].age > 40) {
                int id = workers[i].getId();
                String fio = workers[i].getFio();
                String occupation = workers[i].getOccupation();
                String mail = workers[i].getMail();
                String phone_number = workers[i].getPhone_number();
                int salary = workers[i].getSalary();
                int age = workers[i].getAge();
                System.out.println("id: " + id + " | fio: " + fio + " | occupation: " + occupation + " | mail: " + mail + " | phone_number: " + phone_number + " | salary: " + salary + " | age: " + age);
            }
        }
    }
}
