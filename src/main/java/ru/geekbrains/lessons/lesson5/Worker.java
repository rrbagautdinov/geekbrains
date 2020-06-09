package ru.geekbrains.lessons.lesson5;

public class Worker {

    private int id;
    private String fio;
    private String occupation;
    private String mail;
    private String phone_number;
    private int salary;
    public int age;

    public Worker(int id, String fio, String occupation, String mail, String phone_number, int salary, int age) {
        this.id = id;
        this.fio = fio;
        this.occupation = occupation;
        this.mail = mail;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("id: " + id + " | fio: " + fio + " | occupation: " + occupation + " | mail: " + mail + " | phone_number: " + phone_number + " | salary: " + salary + " | age: " + age);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
