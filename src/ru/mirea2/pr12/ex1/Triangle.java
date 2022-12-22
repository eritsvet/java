package ru.mirea2.pr12.ex1;

import ru.mirea2.pr12.ex1.Point;
import ru.mirea2.pr12.ex1.Shape;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.Random;

public class Triangle extends Shape {
    ru.mirea2.pr12.ex1.Point a, b, c;
    private Random random = new Random();

    public Triangle(int r, int g, int b, int x, int y){

        super(r, g, b, x, y);

        this.a = new Point(x + random.nextInt(-150, 150), x + random.nextInt(-150, 150));
        this.b = new Point(x + random.nextInt(-150, 150), x + random.nextInt(-150, 150));
        this.c = new Point(x + random.nextInt(-150, 150), x + random.nextInt(-150, 150));

    }

    public void draw(Graphics g) {
        int xPoints[] = {a.x, b.x, c.x};
        int yPoints[] = {a.y, b.y, c.y};


        Graphics2D g2d = (Graphics2D) g;
        GeneralPath triangle = new GeneralPath();

        triangle.moveTo(xPoints[0] + center.x, yPoints[0] + center.y);

        for (int i = 1; i < xPoints.length; i++) {
            triangle.lineTo(xPoints[i] + center.x, yPoints[i] + center.y);
        }
        triangle.closePath();

        g2d.setColor(new Color(color.red, color.green, color.blue));
        g2d.fill(triangle);
    }
}