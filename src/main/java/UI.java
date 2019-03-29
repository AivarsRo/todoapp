import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UI {

    public void generateUI() {

        final int frameWidth = 400;
        int frameHeight = 600;

        final JFrame frame = new JFrame();
        frame.setBounds(0, 0, frameWidth, frameHeight);

        final JPanel mainPanel = new JPanel();
        mainPanel.setBounds(0, 0, 200, 300);
        mainPanel.setBackground(Color.LIGHT_GRAY);

        final JButton addToListButton = new JButton("Add Todo");

        final JButton deleteButton = new JButton("Delete");

        final JTextField addToListField = new JTextField("", 20);

        final ArrayList<JPanel> taskList = new ArrayList<JPanel>();

        addToListButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JPanel taskPanel = new JPanel();
                taskPanel.setBackground(Color.ORANGE);
                taskPanel.setPreferredSize(new Dimension(300, 30));

                final JLabel task = new JLabel(addToListField.getText());
                final JCheckBox checkBox = new JCheckBox();
                addToListField.setText("");

                taskList.add(taskPanel);

                System.out.println(taskList.size() + "test");

                taskPanel.add(task);
                taskPanel.add(checkBox);
                mainPanel.add(taskPanel);
                mainPanel.validate();


            }
        });

        mainPanel.add(deleteButton);
        mainPanel.add(addToListButton);
        mainPanel.add(addToListField);
        frame.add(mainPanel);
        frame.setVisible(true);
    }

}
