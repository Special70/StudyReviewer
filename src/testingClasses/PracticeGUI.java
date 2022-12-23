package testingClasses;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PracticeGUI {

    public PracticeGUI() {
        JFrame frame = new JFrame();
        JPanel panel1 = new JPanel();
        JFormattedTextField ftextfield = new JFormattedTextField();
        JButton button1 = new JButton("x");

        Border border = BorderFactory.createLineBorder(Color.BLACK);

        frame.setVisible(true);
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel1);

        panel1.setBorder(border);
        panel1.add(ftextfield);

        button1.setVisible(true);

        ftextfield.setColumns(5);
        ftextfield.add(button1);

        frame.add(panel1);
    }
    public static void main(String args[]) {
        new PracticeGUI();
    }
}
