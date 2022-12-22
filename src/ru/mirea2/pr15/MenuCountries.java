package ru.mirea2.pr15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuCountries extends JFrame{
    public MenuCountries(){
        super("Countries");
        setLayout(new GridLayout(3,1));

        Font fontMedium = new Font("Verdana", Font.PLAIN, 24);
        Font fontLarge = new Font("Verdana", Font.PLAIN, 28);
        Font fontSmall = new Font("Verdana", Font.PLAIN, 20);

        JPanel[] panel = new JPanel[3];
        final JLabel countryName = new JLabel(" ");
        final JLabel textPopulation = new JLabel("");

        String[] arCountries = {
                "Latvia",
                "Lithuania",
                "Estonia"
        };

        panel[0] = new JPanel();
        panel[0].setBackground(Color.WHITE);
        panel[1] = new JPanel();
        panel[1].setBackground(Color.WHITE);
        panel[2] = new JPanel();
        panel[2].setBackground(Color.WHITE);

        add(panel[0]);
        add(panel[1]);
        add(panel[2]);

        countryName.setFont(fontMedium);
        panel[1].add(countryName);

        textPopulation.setFont(fontSmall);
        panel[2].add(textPopulation);


        JComboBox comboBox = new JComboBox(arCountries);
        comboBox.setFont(fontLarge);
        comboBox.setBackground(Color.WHITE);
        panel[0].add(comboBox);

        comboBox.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox)e.getSource();
                String item = (String)box.getSelectedItem();
                countryName.setText(item);

                switch (item){
                    case "Latvia":
                        textPopulation.setText("Population: 1,9 million");
                        break;
                    case "Lithuania":
                        textPopulation.setText("Population: 2,8 million");
                        break;
                    case "Estonia":
                        textPopulation.setText("Population: 1,3 million");
                }
            }
        });


        setSize(1080,720);

    }

    public static void main(String[]args)
    {
        new MenuCountries().setVisible(true);
    }
}
