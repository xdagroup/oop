import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Actions extends JFrame implements ActionListener {

    JLabel l, outcome;
    JPanel j1, j2, j3;
    JButton b1, b2, b3;
    JRadioButton jb1, jb2, jb3;
    ButtonGroup bg;

    private void displayGUIContents() {

        l = new JLabel("CONTROL IN ACTION : RADIO BUTTONS", JLabel.CENTER);

        j1 = new JPanel();
        j2 = new JPanel();
        j3 = new JPanel();

        jb1 = new JRadioButton();
        jb1.setActionCommand("RED");
        jb1.addActionListener(this);
        b1 = new JButton("RED");
        j1.add(jb1);
        j1.add(b1);

        jb2 = new JRadioButton();
        jb2.setActionCommand("YELLOW");
        jb2.addActionListener(this);
        b2 = new JButton("YELLOW");

        j2.add(jb2);
        j2.add(b2);

        jb3 = new JRadioButton();
        jb3.setActionCommand("GREEN");
        jb3.addActionListener(this);
        b3 = new JButton("GREEN");
        j3.add(jb3);
        j3.add(b3);

        bg = new ButtonGroup();
        bg.add(jb1);
        bg.add(jb2);
        bg.add(jb3);

        outcome = new JLabel("NO BUTTON IS PRESENT INITIALLY", JLabel.CENTER);

        add(l);

        add(j1);
        add(j2);
        add(j3);
        add(outcome);
    }

    private void prepareGUI() {

        setSize(550, 550);
        FlowLayout f = new FlowLayout(FlowLayout.LEFT);
        j1.setLayout(f);
        j2.setLayout(f);
        j3.setLayout(f);

        setLayout(new GridLayout(10, 1));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    Actions() {

        displayGUIContents();

        prepareGUI();

    }

    public void actionPerformed(ActionEvent ae) {

        String command = ae.getActionCommand();
        if (command.equals("RED")) {

            outcome.setText(command + " BUTTON PRESSED");
            b1.setBackground(Color.RED);
            b2.setBackground(null);
            b3.setBackground(null);
        }
        if (command.equals("YELLOW")) {

            outcome.setText(command + " BUTTON PRESSED");
            b2.setBackground(Color.YELLOW);
            b1.setBackground(null);
            b3.setBackground(null);
        }
        if (command.equals("GREEN")) {

            outcome.setText(command + " BUTTON PRESSED");
            b3.setBackground(Color.GREEN);
            b1.setBackground(null);
            b2.setBackground(null);
        }
    }
}

public class Traffic {

    public static void main(String args[]) {

        Actions obj = new Actions();
    }
}