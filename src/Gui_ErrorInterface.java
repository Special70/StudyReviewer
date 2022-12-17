import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Gui_ErrorInterface {
    private JFrame frame;
    private JPanel panel;
    private GridLayout layout;
    private JLabel label;
    private JButton button;
    private String placeholder_text = "Placeholder Text";


    public Gui_ErrorInterface() {
        frame = new JFrame("Error");
        panel = new JPanel();
        layout = new GridLayout();
        label = new JLabel();
        button = new JButton("Close");


        layout.setRows(2);
        layout.setColumns(1);



        frame.setSize(300, 100);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frame.add(panel);
        panel.setLayout(layout);
        panel.add(label);
        panel.add(button);

        panel.setBorder(BorderFactory.createEmptyBorder(10, 50, 10, 50));

        label.setText(placeholder_text);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        button.addActionListener(this::actionListener);


    }


    public static void main(String args[]) {
        new Gui_ErrorInterface();
    }
    public void actionListener(ActionEvent e) {
        if (e.getSource() == button) {
            frame.dispose();
        }
    }
}
