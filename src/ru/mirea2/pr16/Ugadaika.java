package ru.mirea2.pr16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

public class Ugadaika extends JFrame {
    public Ugadaika(){
        super("Угадайка");
        setSize(1080,680);
        setLayout(new BorderLayout());

        JTextField userInput = new JTextField();
        add(userInput,BorderLayout.CENTER);

        JButton userButton = new JButton("Проверить");
        add(userButton, BorderLayout.SOUTH);
        final int[] counter = {0};
        Integer iProgrammValue = ThreadLocalRandom.current().nextInt(0, 20 + 1);

        userButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(userInput.getText().toString() == "") return;
                if (userInput.getText().toString().equals(iProgrammValue.toString())){
                    JOptionPane.showMessageDialog(getContentPane(),
                            "Победа",
                            "Вы угадали число",
                            JOptionPane.PLAIN_MESSAGE);
                    setVisible(false);
                    dispose();
                }
                else if(counter[0] == 2){
                    JOptionPane.showMessageDialog(getContentPane(),
                            "Вы не смогли отгадать число",
                            "Проигрыш",
                            JOptionPane.PLAIN_MESSAGE);
                    setVisible(false);
                    dispose();
                }
                else{
                    counter[0]++;
                    if (Integer.parseInt(userInput.getText().toString()) > iProgrammValue){
                        JOptionPane.showMessageDialog(getContentPane(),
                                "Загаданное число меньше введенного",
                                "Хорошая попытка",
                                JOptionPane.PLAIN_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(getContentPane(),
                                "Загаданное число больше введенного",
                                "Хорошая попытка",
                                JOptionPane.PLAIN_MESSAGE);
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        new Ugadaika().setVisible(true);
    }

}