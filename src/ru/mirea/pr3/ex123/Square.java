package ru.mirea.pr3.ex123;

//import ru.mirea.pr3.Rectangle;

class Square extends Rectangle
{
    protected double side;
    public Square()
    {
        this.filled = false;
        this.color = "blue";
        side = 1;
    }

    public Square(double side)
    {
        this.filled = false;
        this.color = "blue";
        this.side = side;
    }

    public Square(double side, String color, boolean filled)
    {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide()
    {
        return side;
    }

    public void setSide(double side)
    {
        this.side = side;
    }
    @Override
    public double getArea()
    {
        return side*side;
    }

    @Override
    public double getPerimeter()
    {
        return 4*side;
    }

    @Override
    public String toString()
    {
        return "Shape: square, side: " + this.side + ", color: " + this.color;
    }
}