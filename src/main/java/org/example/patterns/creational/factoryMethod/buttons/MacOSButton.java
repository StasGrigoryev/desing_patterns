package org.example.patterns.creational.factoryMethod.buttons;

import javax.swing.*;
import java.awt.*;

//Native OS buttons implementation

public class MacOSButton implements Button {

    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;

    //build gui
    @Override
    public void render() {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(new Color(235, 233, 126));
        label.setFont(new Font("Dialog", Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);
        onClick();
        panel.add(button);

        frame.setSize(320, 200);
        frame.setVisible(true);
    }

    @Override
    public void onClick() {
        //initialize the button
        button = new JButton("Exit");
        // make frame invisible and then terminate
        button.addActionListener(e -> {
            frame.setVisible(false);
            System.exit(0);
        });
    }
}
