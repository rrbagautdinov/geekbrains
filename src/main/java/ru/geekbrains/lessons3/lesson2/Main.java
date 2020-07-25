package ru.geekbrains.lessons3.lesson2;

import java.sql.*;

public class Main {
    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement preparedStatement;

    public static void main(String[] args) {
        try {
            connect();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //createTable(); // создание таблицы
        //createUser("Ivan", 30); // создание юзера
        //createUser("Uman", 10); // создание юзера
        //updateUser("Ivan", "Roman", 500); // кого ищем в бд (name) На что меняем (name, score)
        //selectUser("Uman"); // выбираем юзера и выводим в консоль
        //deleteTable(); // удаление таблицы
        disconnect();
    }

    public static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:main.db");
        statement = connection.createStatement();
    }

    public static void disconnect() {
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void createTable() {
        try {
            int rsAddTable = statement.executeUpdate("CREATE TABLE students (id INTEGER PRIMARY KEY autoincrement, name TEXT, score INTEGER )");
            System.out.println("Таблица успешно создана " + rsAddTable);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteTable() {
        try {
            int rsDeleteTable = statement.executeUpdate("DROP TABLE students");
            System.out.println("Таблица успешно удалена " + rsDeleteTable);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createUser(String name, int score) {
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO students (name, score) VALUES (?, ?)");
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, score);
            int commit = preparedStatement.executeUpdate();
            System.out.println("Пользователь успешно добавлен " + commit);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateUser(String find_name, String new_name, int new_score) {
        try {
            preparedStatement = connection.prepareStatement("UPDATE students SET name =?, score =? WHERE name =?");
            preparedStatement.setString(1, new_name);
            preparedStatement.setInt(2, new_score);
            preparedStatement.setString(3, find_name);
            int commit = preparedStatement.executeUpdate();
            System.out.println("Пользователь успешно отредактирован " + commit);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void selectUser(String name) {
        try {
            preparedStatement = connection.prepareStatement("SELECT id, name, score FROM students WHERE name = ?");
            preparedStatement.setString(1, name);
            ResultSet rs = preparedStatement.executeQuery();
            System.out.println("Пользователь выбран: " + rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
