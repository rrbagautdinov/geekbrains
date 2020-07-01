package ru.geekbrains.lessons2.lesson4;

import javax.swing.*;
import java.awt.event.*;

public class Window extends JFrame {
    public Window() {
        setTitle("БРР Чат v. 0.1");
        setSize(500,600);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        userInterface();

        setVisible(true);
    }

    public void userInterface() {

        // Главное окно
        JPanel generalWindow = new JPanel();
        generalWindow.setLayout(null);

        // Окно с сообщениями
        JTextArea areaOfMessages = new JTextArea();
        areaOfMessages.setBounds(15, 15, 465, 475);
        areaOfMessages.setEditable(false);
        JScrollPane scrollMessageArea = new JScrollPane(areaOfMessages);
        generalWindow.add(scrollMessageArea);
        generalWindow.add(areaOfMessages);

        // Окно для ввода текста
        JTextArea inputMessageArea = new JTextArea();
        inputMessageArea.setBounds(15,505,350,50);
        inputMessageArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    areaOfMessages.append("Роман: " + inputMessageArea.getText());
                    inputMessageArea.setText("");
                    inputMessageArea.grabFocus();
                }
            }
        });
        generalWindow.add(inputMessageArea);

        // Кнопка для отправки текста
        JButton sendButton = new JButton("Отправить");
        sendButton.setBounds(380,505,100,50);
        ActionListener sendAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaOfMessages.append("Роман: " + inputMessageArea.getText() + "\n");
                inputMessageArea.setText("");
                inputMessageArea.grabFocus();
            }
        };
        sendButton.addActionListener(sendAction);
        generalWindow.add(sendButton);

        getContentPane().add(generalWindow);
        setVisible(true);
    }

}
