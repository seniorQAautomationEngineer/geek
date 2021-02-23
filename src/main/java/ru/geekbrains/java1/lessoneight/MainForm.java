package ru.geekbrains.java1.lessoneight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {

    public MainForm() {
        this.setBounds(500, 300, 800, 400);
        this.setTitle("Simple Swing application");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

//       JButton buttonC = new JButton("[CENTER] Click on me!");
//       this.add(buttonC, BorderLayout.CENTER);
//       this.setVisible(true);
//
//        JButton buttonN = new JButton("[NORTH] Click on me!");
//        this.add(buttonN, BorderLayout.NORTH);
//        this.setVisible(true);
//
//        JButton buttonW = new JButton("[WEST] Click on me!");
//        this.add(buttonW, BorderLayout.WEST);
//
//        buttonC.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Center click!!!");
//            }
//        });

        JTextArea textArea = new JTextArea();
        this.add(textArea, BorderLayout.CENTER);

        JPanel southPanel = new JPanel(new GridLayout(1, 10, 5, 0));
        this.add(southPanel, BorderLayout.SOUTH);

        for (int i = 0; i <= 10 ; i++) {
            JButton button = new JButton(String.valueOf(i));
            southPanel.add(button);
            final int index = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textArea.append(String.valueOf(index) + '\n');
                }
            });
        }

        this.setVisible(true);
    }
}
