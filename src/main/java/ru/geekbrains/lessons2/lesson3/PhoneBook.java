package ru.geekbrains.lessons2.lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    public String name, phone;

    public PhoneBook(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public static void main(String[] args) {
        List<PhoneBook> phoneList = new ArrayList<>();
        Map<String, String> hmPhoneList = new HashMap<>();

        phoneList.add(new PhoneBook("Иванов", "79258885566"));
        phoneList.add(new PhoneBook("Сидоров", "79258885522"));
        phoneList.add(new PhoneBook("Калыванов", "79258885533"));
        phoneList.add(new PhoneBook("Иванов", "79258885533"));
        phoneList.add(new PhoneBook("Ульянов", "79010002211"));

        for (int i = 0; i < phoneList.size(); i++) {
            String name = phoneList.get(i).getName();
            String phone = phoneList.get(i).getPhone();
            System.out.println("Name: " + name + " " + "Phone: " + phone);
        }

    }

}
