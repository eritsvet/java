package ru.mirea2.pr3.mathrandom.ex2;

public class Circle
{
    Point center;
    int radius;
    public Circle (double x, double y, int radius)
    {
        center = new Point(x,y);
        this.radius=radius;
    }

    public int getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }
}
