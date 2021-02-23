import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class CalcActions extends JFrame {

    JPanel j1, j2, j3;
    JLabel num1label, num2label, resultlabel, outcome;
    JTextField num1, num2, result;
    JButton addButton, subtractButton, multiplyButton, divideButton;

    public void displayGUIContents() {

        j1 = new JPanel();
        j2 = new JPanel();
        j3 = new JPanel();

        num1label = new JLabel("Number 1: ");
        num1 = new JTextField(8);
        num2label = new JLabel("Number 2: ");
        num2 = new JTextField(8);
        resultlabel = new JLabel("Result: ");
        result = new JTextField(8);

        addButton = new JButton("Add");
        subtractButton = new JButton("Subtract");
        multiplyButton = new JButton("Multiply");
        divideButton = new JButton("Divide");

        JLabel outcome = new JLabel("");

        j1.add(num1label);
        j1.add(num1);
        j1.add(num2label);
        j1.add(num2);
        j1.add(resultlabel);
        j1.add(result);

        j2.add(addButton);
        j2.add(subtractButton);
        j2.add(multiplyButton);
        j2.add(divideButton);

        j3.add(outcome);

        add(j1);
        add(j2);
        add(j3);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                outcome.setText("Add Button Pressed");
                int number1 = Integer.parseInt(num1.getText());
                int number2 = Integer.parseInt(num2.getText());
                int value = number1 + number2;
                result.setText(value + "");
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                outcome.setText("Subtract Button Pressed");
                int number1 = Integer.parseInt(num1.getText());
                int number2 = Integer.parseInt(num2.getText());
                int value = number1 - number2;
                result.setText(value + "");
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                outcome.setText("Multiply Button Pressed");
                int number1 = Integer.parseInt(num1.getText());
                int number2 = Integer.parseInt(num2.getText());
                int value = number1 * number2;
                result.setText(value + "");
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                outcome.setText("Division Button Pressed");
                int number1 = Integer.parseInt(num1.getText());
                int number2 = Integer.parseInt(num2.getText());
                int value;
                try {
                    value = number1 / number2;
                    result.setText(value + "");
                } catch (Exception e) {

                    outcome.setText("Division Error");
                }
            }
        });

    }

    public void prepareGUI() {

        setSize(550, 550);
        setLayout(new GridLayout(10, 1));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    CalcActions() {

        displayGUIContents();
        prepareGUI();

    }

}

public class CalculatorDemo1 {

    public static void main(String args[]) {

        CalcActions obj = new CalcActions();
    }
}