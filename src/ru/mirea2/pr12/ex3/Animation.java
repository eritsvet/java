package ru.mirea2.pr12.ex3;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class Animation extends JFrame {


    public Animation() throws Exception {

        super("Animation");
        setLayout(new BorderLayout());
        setSize(1920, 1080);
        this.getContentPane().setBackground( Color.BLACK );


        Image[] frames = {
                ImageIO.read(new File("C:/Users/dagni/Desktop/жава/1.png")),
                ImageIO.read(new File("C:/Users/dagni/Desktop/жава/2.png")),
                ImageIO.read(new File("C:/Users/dagni/Desktop/жава/3.png")),
                ImageIO.read(new File("C:/Users/dagni/Desktop/жава/4.png")),
                ImageIO.read(new File("C:/Users/dagni/Desktop/жава/5.png")),
                ImageIO.read(new File("C:/Users/dagni/Desktop/жава/6.png")),
                ImageIO.read(new File("C:/Users/dagni/Desktop/жава/7.png")),
                ImageIO.read(new File("C:/Users/dagni/Desktop/жава/8.png")),
        };

        BufferedImage img = null;

        JToggleButton btn = new JToggleButton("Start");
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.gray);
        btn.setFocusPainted(false);
        btn.setFont(new Font("Times New Roman", Font.BOLD, 32));
        JPanel jp = new JPanel(new BorderLayout());
        JLabel label = new JLabel(new ImageIcon(frames[0]));
        add(label, BorderLayout.CENTER);
        jp.add(btn, BorderLayout.CENTER);
        add(jp, BorderLayout.NORTH);

        ActionListener animate = new ActionListener() {

            public int index = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (index < frames.length - 1) {
                    index++;
                } else {
                    index = 0;
                }
                label.setIcon(new ImageIcon(frames[index]));
            }
        };
        final Timer timer = new Timer(50, animate);
        Border emptyBorder = BorderFactory.createEmptyBorder();
        btn.setBorder(emptyBorder);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btn.isSelected()) {
                    btn.setText("Stop");
                    timer.start();
                    btn.setForeground(Color.WHITE);
                } else {
                    btn.setText("Start");
                    timer.stop();
                    btn.setForeground(Color.gray);
                }

            }
        });
        UIManager.put("ToggleButton.select", Color.BLACK);
        SwingUtilities.updateComponentTreeUI(btn);
    }

    public static void main(String[] args) throws Exception {
        new Animation().setVisible(true);
    }
}