package ru.mirea.pr4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MatchMilanMadrid extends JFrame
{
    int milan, madrid;
    JButton butACMilan = new JButton("AC Milan");
    JButton butRealMadrid = new JButton("Real Madrid");
    JLabel resultLabel = new JLabel("Result: 0 X 0");
    JLabel lastScorerLabel = new JLabel("Last Scorer: N/A");
    JLabel winnerLabel = new JLabel("Winner: DRAW");

    public MatchMilanMadrid()
    {
        super("Match AC Milan vs Real Madrid");
        setLayout(new FlowLayout());
        setSize(180,200);
        resultLabel.setLocation(20,100);
        add(butACMilan);
        add(butRealMadrid);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);
        butACMilan.addActionListener(e->{
            milan++;
            updateTheResult("AC Milan");
        });
        butRealMadrid.addActionListener(e->{
            madrid++;
            updateTheResult("Real Madrid");
        });
        setVisible(true);
    }
    private void updateTheResult (String s)
    {
        String win;
        resultLabel.setText("Result: " + milan + " X " + madrid);
        lastScorerLabel.setText("Last Scorer: " + s);
        if (milan>madrid)
            win = "AC Milan";
        else if (madrid>milan)
            win = "Real Madrid";
        else win = "DRAW";
        winnerLabel.setText("Winner: " + win);
    }
    public static void main(String[] args) {
        new MatchMilanMadrid();
    }
}
