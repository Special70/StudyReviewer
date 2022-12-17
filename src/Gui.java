import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Gui{
    private JFrame baseFrame;
    private JPanel mainPanel, basePanel1, basePanel2, basePanel3, basePanel3_1;
    private Border textBorder01, textBorder02, blackline, emptyborderx20;
    private JLabel bFrameLabel, bFrameLabel_text003;
    private JRadioButton topic01, topic02, topic03, choice01, choice02;
    private JTextField textfield01;
    private GridLayout basicLayout, layout_bFL_text03;
    private JButton button01;
    public int objChecker = 0;

    public boolean btopic1, btopic2, btopic3, bchoice1, bchoice2;
    public Gui() {
        // Initialized variable
            baseFrame = new JFrame();
                mainPanel = new JPanel();
                    basePanel1 = new JPanel();
                    bFrameLabel  = new JLabel();
                       topic01 = new JRadioButton("Linear Motion & Collisions");
                       topic02 = new JRadioButton("Center of Mass");
                       topic03 = new JRadioButton("Rotational Equilibrium");
                    basePanel2 = new JPanel();
                        choice01 = new JRadioButton("Multiple Choice");
                        choice02 = new JRadioButton("Identification");
                    basePanel3 = new JPanel();
                        basePanel3_1 = new JPanel();
                            bFrameLabel_text003 = new JLabel("Amount of Questions:");
                            textfield01 = new JTextField(5);
                        button01 = new JButton("Create");

        // Layouts
            basicLayout = new GridLayout();
            layout_bFL_text03 = new GridLayout();

            layout_bFL_text03.setColumns(1);
            layout_bFL_text03.setRows(2);

            basicLayout.setRows(5);
            basicLayout.setColumns(1);
            /*Basically a gap between elements of the layout.*/
            basicLayout.setVgap(10);

        // Constraints

        // Borders for JFrames
            blackline = BorderFactory.createLineBorder(Color.black);
            textBorder01 = BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Topic");
            textBorder02 = BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Question Type");
            emptyborderx20 = BorderFactory.createEmptyBorder(20, 20, 20, 20);

        // ImageIcon variable
            ImageIcon jframeimage = new ImageIcon("assets/icon.png");

        // baseFrame settings
            baseFrame.add(mainPanel);
            baseFrame.setTitle("Physics Quiz Generator");
            baseFrame.setIconImage(jframeimage.getImage());
            baseFrame.setSize(400, 750);
            baseFrame.setVisible(true);
            baseFrame.setLocationRelativeTo(null);
            baseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // bFrameLabel settings
            bFrameLabel.setIcon(new ImageIcon("assets/header.png"));
            bFrameLabel.setHorizontalAlignment(bFrameLabel.CENTER);
            bFrameLabel.setVerticalAlignment(bFrameLabel.NORTH);

        // setVisible and Containers
            bFrameLabel.setVisible(true);


        // basepPanel settings
            mainPanel.setBorder(emptyborderx20);
            mainPanel.setVisible(true);
            mainPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
            mainPanel.setLayout(basicLayout);
            /*
            What happened here is that I created a panel to put a jlabel and a jpanel inside to
            have them occupy the space properly
            */
            mainPanel.add(bFrameLabel);
            mainPanel.add(basePanel1);
                basePanel1.setLayout(basicLayout);
                basePanel1.setBorder(textBorder01);
                basePanel1.setVisible(true);
                basePanel1.add(topic01);
                basePanel1.add(topic02);
                basePanel1.add(topic03);
            mainPanel.add(basePanel2);
                basePanel2.setLayout(basicLayout);
                basePanel2.setBorder(textBorder02);
                basePanel2.setVisible(true);
                basePanel2.add(choice01);
                basePanel2.add(choice02);
            mainPanel.add(basePanel3);
                basePanel3.setLayout(layout_bFL_text03);
                basePanel3.setBorder(blackline);
                basePanel3.setVisible(true);
                basePanel3.add(basePanel3_1);
                    basePanel3_1.add(bFrameLabel_text003);
                    basePanel3_1.add(textfield01);
                basePanel3.add(button01);

        // Button Event Listeners
            button01.addActionListener(this::actionPerformed);
            topic01.addActionListener(this::actionPerformed);
            topic02.addActionListener(this::actionPerformed);
            topic03.addActionListener(this::actionPerformed);
            choice01.addActionListener(this::actionPerformed);
            choice02.addActionListener(this::actionPerformed);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == topic01) {
            if (!btopic1) {
                btopic1 = true;
                objChecker++;
            } else {
                btopic1 = false;
                objChecker--;
            }
        } else if (e.getSource() == topic02) {
            if (!btopic2) {
                btopic2 = true;
                objChecker++;
            } else {
                btopic2 = false;
                objChecker--;
            }
        } else if (e.getSource() == topic03) {
            if (!btopic3) {
                btopic3 = true;
                objChecker++;
            } else {
                btopic3 = false;
                objChecker--;
            }
        } else if (e.getSource() == choice01) {
            if (!bchoice1) {
                bchoice1 = true;
                objChecker++;
            } else {
                bchoice1 = false;
                objChecker--;
            }
        } else if (e.getSource() == choice02) {
            if (!bchoice2) {
                bchoice2 = true;
                objChecker++;
            } else {
                bchoice2 = false;
                objChecker--;
            }
        }
        if (e.getSource() == button01 && objChecker == 0) {
            new Gui_ErrorInterface();
        } else if (e.getSource() == button01 && objChecker != 0) {
            new Gui_SuccessInterface();
        }
    }

    public static void main(String arg[]) {
        new Gui();
    }
}
