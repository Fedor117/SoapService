package by.bsuir.aipos.sem6.soap.client;

import by.bsuir.aipos.sem6.soap.client.view.MainFrame;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Created by Dzmitry Saladukha on 16.04.2016.
 */
public class EntryPoint {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | UnsupportedLookAndFeelException
                    | IllegalAccessException | InstantiationException e1) {
                e1.printStackTrace();
            }
        }

        javax.swing.SwingUtilities.invokeLater(MainFrame::new);
    }
}
