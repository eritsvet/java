package ru.mirea.lab5;
import java.awt.*;
import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
public class Picture extends JPanel {
    Image img = new ImageIcon("C:/Users/dagni/Desktop/разработка клиентских частей интернет ресурсов/hiphop.jpg").getImage();
    public static void main(String[] args){
        /*String str;
        Scanner s = new Scanner(System.in);
        str = s.nextLine();*/
        //Image img = new ImageIcon(str).getImage();
        JFrame fr = new JFrame();
        fr.setLayout(null);
        fr.setSize(1000, 650);
        Picture p = new Picture();
        p.setBounds(0,0,1000,650);
        fr.add(p);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public void paintComponent(Graphics g)
    {
        g.drawImage(img,0,0,null);
    }
}
