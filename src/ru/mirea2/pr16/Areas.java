package ru.mirea2.pr16;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Areas extends JFrame {
    public Areas() {
        super("TextAreas");
        setSize(1080,680);
        setLayout(new BorderLayout());

        JPanel center = new JPanel();
        center.setLayout(new GridBagLayout());
        add(center, BorderLayout.CENTER);
        center.add(new JLabel("CENTER"));

        JPanel west = new JPanel();
        west.setLayout(new GridBagLayout());
        add(west, BorderLayout.WEST);
        west.add(new JLabel("WEST"));

        JPanel south = new JPanel();
        south.setLayout(new GridBagLayout());
        add(south, BorderLayout.SOUTH);
        south.add(new JLabel("SOUTH"));

        JPanel north = new JPanel();
        north.setLayout(new GridBagLayout());
        add(north, BorderLayout.NORTH);
        north.add(new JLabel("NORTH"));

        JPanel east = new JPanel();
        east.setLayout(new GridBagLayout());
        add(east, BorderLayout.EAST);
        east.add(new JLabel("EAST"));

        final Integer[] mouse_prev_position = {0};

        center.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                if (mouse_prev_position[0] == 1) return;
                JOptionPane.showMessageDialog(getContentPane(),
                        "Добро пожаловать в ЦАО",
                        "Успех",
                        JOptionPane.PLAIN_MESSAGE);
                mouse_prev_position[0] = 1;
            }

            @Override
            public void mouseExited(MouseEvent e) {}
        });

        west.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                if (mouse_prev_position[0] == 2) return;
                JOptionPane.showMessageDialog(getContentPane(),
                        "Добро пожаловать в ЗАО",
                        "Успех",
                        JOptionPane.PLAIN_MESSAGE);
                mouse_prev_position[0] = 1;
            }

            @Override
            public void mouseExited(MouseEvent e) {}
        });

        south.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                if (mouse_prev_position[0] == 3) return;
                JOptionPane.showMessageDialog(getContentPane(),
                        "Добро пожаловать в ЮАО",
                        "Успех",
                        JOptionPane.PLAIN_MESSAGE);
                mouse_prev_position[0] = 1;
            }

            @Override
            public void mouseExited(MouseEvent e) {}
        });

        north.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                if (mouse_prev_position[0] == 4) return;
                JOptionPane.showMessageDialog(getContentPane(),
                        "Добро пожаловать в САО",
                        "Успех",
                        JOptionPane.PLAIN_MESSAGE);
                mouse_prev_position[0] = 1;
            }

            @Override
            public void mouseExited(MouseEvent e) {}
        });

        east.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                if (mouse_prev_position[0] == 5) return;
                JOptionPane.showMessageDialog(getContentPane(),
                        "Добро пожаловать в ВАО",
                        "Успех",
                        JOptionPane.PLAIN_MESSAGE);
                mouse_prev_position[0] = 1;
            }

            @Override
            public void mouseExited(MouseEvent e) {}
        });

    }


    public static void main(String[] args) {
        new Areas().setVisible(true);
    }

}