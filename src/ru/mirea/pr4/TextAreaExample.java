package ru.mirea.pr4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TextAreaExample extends JFrame
{
    JTextArea jta1 = new JTextArea(10,25);
    JButton button = new JButton("Add some Text");

    public TextAreaExample()
    {
        super("Example");
        setSize(300,300);
        setLayout(new FlowLayout());
        add(jta1);
        JScrollPane Scroll = new JScrollPane(jta1);
        Scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        add(Scroll); // we add the scrollPane and not the text area.
        Scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        add(Scroll);
        add(button);
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String txt = JOptionPane.showInputDialog(null,"Insert some text");
                jta1.append(txt);
            }
        });
    }
    public static void main(String[]args)
    {
        new TextAreaExample().setVisible(true);
    }
}