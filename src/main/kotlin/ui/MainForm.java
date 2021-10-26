package ui;

import javax.swing.*;
import java.awt.*;

public class MainForm extends JFrame{
    private JPanel rootPanel;
    private JButton ButtonNewContact;
    private JButton ButtonRemove;
    private JTable Contacts;

    public MainForm(){

        setContentPane(rootPanel);
        setSize(500,250);
        setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((dim.width - getSize().width)/2,(dim.height - getSize().height)/2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
