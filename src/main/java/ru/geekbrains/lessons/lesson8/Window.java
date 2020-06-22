package ru.geekbrains.lessons.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Window extends JFrame {
        private String operation = "";
        private double first = 0;
        private double second = 0;
        private double result = 0;


    public Window() {
        setTitle("Калькулятор БРР v. 0.1");
        setSize(300, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        // Дисплей для калькулятора
        final JPanel display = new JPanel();
        final JTextField display_field = new JTextField(26);
        display.add(display_field);
        add(display, BorderLayout.NORTH);

        // Кнопки для калькулятора
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(4, 3));

        final JButton button1 = new JButton("1");
        buttons.add(button1);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display_field.setText(display_field.getText() + "1");
            }
        });

        JButton button2 = new JButton("2");
        buttons.add(button2);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display_field.setText(display_field.getText() + "2");
            }
        });

        JButton button3 = new JButton("3");
        buttons.add(button3);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display_field.setText(display_field.getText() + "3");
            }
        });

        JButton button5 = new JButton("4");
        buttons.add(button5);
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display_field.setText(display_field.getText() + "4");
            }
        });

        JButton button6 = new JButton("5");
        buttons.add(button6);
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display_field.setText(display_field.getText() + "5");
            }
        });

        JButton button7 = new JButton("6");
        buttons.add(button7);
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display_field.setText(display_field.getText() + "6");
            }
        });

        JButton button9 = new JButton("7");
        buttons.add(button9);
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display_field.setText(display_field.getText() + "7");
            }
        });

        JButton button10 = new JButton("8");
        buttons.add(button10);
        button10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display_field.setText(display_field.getText() + "8");
            }
        });

        JButton button11 = new JButton("9");
        buttons.add(button11);
        button11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display_field.setText(display_field.getText() + "9");
            }
        });


        JButton button13 = new JButton("=");
        buttons.add(button13);
        button13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if ("+".equals(operation)) {
                    second = Double.parseDouble(display_field.getText());
                    result = first + second;
                    display_field.setText(String.valueOf(result));
                }

                if ("-".equals(operation)) {
                    second = Double.parseDouble(display_field.getText());
                    result = first - second;
                    display_field.setText(String.valueOf(result));
                }

                if ("*".equals(operation)) {
                    second = Double.parseDouble(display_field.getText());
                    result = first * second;
                    display_field.setText(String.valueOf(result));
                }

                if ("/".equals(operation)) {
                    second = Double.parseDouble(display_field.getText());
                    result = first / second;
                    display_field.setText(String.valueOf(result));
                }
            }
        });


        JButton button14 = new JButton("0");
        buttons.add(button14);
        button14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display_field.setText(display_field.getText() + "0");
            }
        });

        JButton button15 = new JButton(".");
        buttons.add(button15);
        button15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display_field.setText(display_field.getText() + ".");
            }
        });

        add(buttons);

        // Кнопки управления
        JPanel control_buttons = new JPanel();
        control_buttons.setLayout(new GridLayout(5, 1));

        JButton button17 = new JButton("C");
        control_buttons.add(button17);
        button17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display_field.setText("");
            }
        });

        JButton button4 = new JButton("/");
        control_buttons.add(button4);
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(display_field.getText());
                operation = "/";
                display_field.setText("");
            }
        });

        JButton button8 = new JButton("*");
        control_buttons.add(button8);
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(display_field.getText());
                operation = "*";
                display_field.setText("");
            }
        });

        JButton button12 = new JButton("-");
        control_buttons.add(button12);
        button12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(display_field.getText());
                operation = "-";
                display_field.setText("");
            }
        });

        JButton button16 = new JButton("+");
        control_buttons.add(button16);
        button16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(display_field.getText());
                operation = "+";
                display_field.setText("");
            }
        });

        add(control_buttons, BorderLayout.EAST);
        setVisible(true);
    }


}


