import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Gui_QuestionGenerator {

    private JFrame baseFrame;

    private JLabel bodyPane01_1_label1, bL2, bL3;
    private JFormattedTextField bodyPane01_1_label1_jftextfield;
    private JButton bodyPane01_1_label1_jftextfield_panel_button1, bodyPane01_1_label1_jftextfield_panel_button2;

    private JPanel basePanel, bodyPanel01, bodyPane01_1;
    private JPanel bodyPane01_1_label1_jftextfield_panel;

    private Border textBorder, textBorder2, emptyBorder;
    private GridLayout bFrameLayout, grid3Rows;
    private FlowLayout leftSide;

    public Gui_QuestionGenerator() {

        // Setitngs for Variables
        grid3Rows = new GridLayout();
        grid3Rows.setRows(3);
        bFrameLayout = new GridLayout();
        bFrameLayout.setRows(2);
        leftSide = new FlowLayout();
        leftSide.setAlignment(FlowLayout.LEFT);

        textBorder = BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Main Editor");
        textBorder2 = BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Questions Editor");
        emptyBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);

        // Implementation Map
        baseFrame = new JFrame();
            basePanel = new JPanel();
                bodyPanel01 = new JPanel();
                    bodyPane01_1 = new JPanel(leftSide);
                    bodyPane01_1_label1 = new JLabel();
                    bodyPane01_1_label1_jftextfield = new JFormattedTextField();
                        bodyPane01_1_label1_jftextfield_panel = new JPanel();
                        bodyPane01_1_label1_jftextfield_panel_button1 = new JButton();
                        bodyPane01_1_label1_jftextfield_panel_button2 = new JButton();


        // JFrame
        baseFrame.setVisible(true);
        baseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        baseFrame.setSize(400, 700);
        baseFrame.setLocationRelativeTo(null);
        baseFrame.setTitle("Question Generator for StudyReviewer");

        // JLabel

        bodyPane01_1_label1.setText("Amount of Questions: ");

        // JFormattedTextField
        bodyPane01_1_label1_jftextfield.setColumns(5);
        bodyPane01_1_label1_jftextfield.add(bodyPane01_1_label1_jftextfield_panel_button1);


        // JPanel
        basePanel.setBorder(emptyBorder);
        basePanel.setLayout(bFrameLayout);

        bodyPanel01.setBorder(textBorder);
        bodyPanel01.setLayout(grid3Rows);

        bodyPane01_1_label1_jftextfield_panel.setLayout(bFrameLayout);
        bodyPane01_1_label1_jftextfield_panel.add(bodyPane01_1_label1_jftextfield_panel_button1);
        bodyPane01_1_label1_jftextfield_panel.add(bodyPane01_1_label1_jftextfield_panel_button2);

        // Add Stuff
        baseFrame.add(basePanel);
            basePanel.add(bodyPanel01);
                bodyPanel01.add(bodyPane01_1);
                bodyPane01_1.add(bodyPane01_1_label1);
                bodyPane01_1.add(bodyPane01_1_label1_jftextfield);


    }



    public static void main(String args[]) {
        new Gui_QuestionGenerator();
    }
}
