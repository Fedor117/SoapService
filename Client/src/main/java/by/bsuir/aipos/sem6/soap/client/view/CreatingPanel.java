package by.bsuir.aipos.sem6.soap.client.view;

import by.bsuir.aipos.sem6.soap.client.Controller;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;

/**
 * Created by Dzmitry Saladukha on 15.04.2016.
 */
class CreatingPanel extends JPanel {
    CreatingPanel(Controller controller) {
        super(new BorderLayout());

        JButton button = new JButton("create");
        JTextField nameTF = new JTextField(15);
        JTextField definitionTF = new JTextField(30);
        JPanel panel = new JPanel();
        JLabel label = new JLabel();

        button.addActionListener((e) -> {
            String name = nameTF.getText().trim();
            String definition = definitionTF.getText().trim();
            String result = controller.create(name, definition);
            if (result != null) {
                label.setText("<html><body style=\"padding: 20px\"><p style=\"font-size: 2em\">" + result +
                        "</p></body></html>");
            } else {
                label.setText(
                        "<html><body style=\"padding: 20px\"><p style=\"font-size: 2em\">Nothing was found.</p></body></html>");
            }
        });

        panel.add(nameTF);
        panel.add(definitionTF);
        panel.add(button);
        add(panel, BorderLayout.NORTH);
        add(label, BorderLayout.CENTER);
    }
}
