package ru.geekbrains.uiCalc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UiCalc extends JFrame {

    private double TEMP;
    private double SolveTEMP;
    private final JTextField textFieldResult;

    Boolean addBool = false;
    Boolean subBool = false;
    Boolean divBool = false;
    Boolean mulBool = false;

    String display = "";

    public UiCalc() {

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(4, 3));
        JButton buttonNum1;
        panel1.add(buttonNum1 = new JButton("1"));
        JButton buttonNum2;
        panel1.add(buttonNum2 = new JButton("2"));
        JButton buttonNum3;
        panel1.add(buttonNum3 = new JButton("3"));
        JButton buttonNum4;
        panel1.add(buttonNum4 = new JButton("4"));
        JButton buttonNum5;
        panel1.add(buttonNum5 = new JButton("5"));
        JButton buttonNum6;
        panel1.add(buttonNum6 = new JButton("6"));
        JButton buttonNum7;
        panel1.add(buttonNum7 = new JButton("7"));
        JButton buttonNum8;
        panel1.add(buttonNum8 = new JButton("8"));
        JButton buttonNum9;
        panel1.add(buttonNum9 = new JButton("9"));
        JButton buttonNum0;
        panel1.add(buttonNum0 = new JButton("0"));
        JButton buttonClear;
        panel1.add(buttonClear = new JButton("C"));

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(textFieldResult = new JTextField(15));
        textFieldResult.setHorizontalAlignment(JTextField.LEFT);
        textFieldResult.setEditable(false);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(5, 1));
        JButton buttonAdd;
        panel3.add(buttonAdd = new JButton("+"));
        JButton buttonSubtract;
        panel3.add(buttonSubtract = new JButton("-"));
        JButton buttonMultiply;
        panel3.add(buttonMultiply = new JButton("*"));
        JButton buttonDivide;
        panel3.add(buttonDivide = new JButton("/"));
        JButton buttonSolve;
        panel3.add(buttonSolve = new JButton("="));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout());
        panel.add(panel2, BorderLayout.NORTH);
        panel.add(panel1, BorderLayout.SOUTH);
        panel.add(panel3, BorderLayout.EAST);

        add(panel);

        buttonNum1.addActionListener(new ListenToOne());
        buttonNum2.addActionListener(new ListenToTwo());
        buttonNum3.addActionListener(new ListenToThree());
        buttonNum4.addActionListener(new ListenToFour());
        buttonNum5.addActionListener(new ListenToFive());
        buttonNum6.addActionListener(new ListenToSix());
        buttonNum7.addActionListener(new ListenToSeven());
        buttonNum8.addActionListener(new ListenToEight());
        buttonNum9.addActionListener(new ListenToNine());
        buttonNum0.addActionListener(new ListenToZero());

        buttonAdd.addActionListener(new ListenToAdd());
        buttonSubtract.addActionListener(new ListenToSubtract());
        buttonMultiply.addActionListener(new ListenToMultiply());
        buttonDivide.addActionListener(new ListenToDivide());
        buttonSolve.addActionListener(new ListenToSolve());
        buttonClear.addActionListener(new ListenToClear());
    }

    class ListenToClear implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textFieldResult.setText("");
            addBool = false;
            subBool = false;
            mulBool = false;
            divBool = false;

            TEMP = 0;
            SolveTEMP = 0;
        }
    }

    class ListenToOne implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = textFieldResult.getText();
            textFieldResult.setText(display + "1");
        }
    }

    class ListenToTwo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = textFieldResult.getText();
            textFieldResult.setText(display + "2");
        }
    }

    class ListenToThree implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = textFieldResult.getText();
            textFieldResult.setText(display + "3");
        }
    }

    class ListenToFour implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = textFieldResult.getText();
            textFieldResult.setText(display + "4");
        }
    }

    class ListenToFive implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = textFieldResult.getText();
            textFieldResult.setText(display + "5");
        }
    }

    class ListenToSix implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = textFieldResult.getText();
            textFieldResult.setText(display + "6");
        }
    }

    class ListenToSeven implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = textFieldResult.getText();
            textFieldResult.setText(display + "7");
        }
    }

    class ListenToEight implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = textFieldResult.getText();
            textFieldResult.setText(display + "8");
        }
    }

    class ListenToNine implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = textFieldResult.getText();
            textFieldResult.setText(display + "9");
        }
    }

    class ListenToZero implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = textFieldResult.getText();
            textFieldResult.setText(display + "0");
        }
    }

    class ListenToAdd implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(textFieldResult.getText());
            textFieldResult.setText("");
            addBool = true;
        }
    }

    class ListenToSubtract implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(textFieldResult.getText());
            textFieldResult.setText("");
            subBool = true;
        }
    }

    class ListenToMultiply implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(textFieldResult.getText());
            textFieldResult.setText("");
            mulBool = true;
        }
    }

    class ListenToDivide implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(textFieldResult.getText());
            textFieldResult.setText("");
            divBool = true;
        }
    }

    class ListenToSolve implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SolveTEMP = Double.parseDouble(textFieldResult.getText());
            if (addBool)
                SolveTEMP = SolveTEMP + TEMP;
            else if (subBool)
                SolveTEMP = SolveTEMP - TEMP;
            else if (mulBool)
                SolveTEMP = SolveTEMP * TEMP;
            else if (divBool)
                SolveTEMP = SolveTEMP / TEMP;
            textFieldResult.setText(  Double.toString(SolveTEMP));

            addBool = false;
            subBool = false;
            mulBool = false;
            divBool = false;
        }
    }

    public static void main(String[] args) {
        UiCalc calc = new UiCalc();
        calc.setTitle("Calculator");
        calc.pack();
        calc.setLocationRelativeTo(null);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
    }

}