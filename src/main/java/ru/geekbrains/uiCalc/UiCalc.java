package ru.geekbrains.uiCalc;

import javax.swing.*;

public class UiCalc extends JFrame {

    public UiCalc() {
        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UiCalc();
    }
}
