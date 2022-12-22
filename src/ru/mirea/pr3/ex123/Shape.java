package ru.mirea.pr3.ex123;
import java.math.*;
public abstract class Shape
{
    protected boolean filled;
    protected String color;
    public Shape()
    {
        this.filled = false;
        this.color = "blue";
    }
    public Shape(String color, boolean filled)
    {
        this.filled = filled;
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public String toString()
    {
        return "Shape, color: " + this.color;
    }

    /*class Triangle extends Shape
    {
        protected double side;
        protected double height;
        public Triangle()
        {
            this.filled = false;
            this.color = "blue";
            side = 2;
            height = 1;
        }

        public Triangle(double side, double height)
        {
            this.filled = false;
            this.color = "blue";
            this.side = side;
            this.height = height;
        }

        public Triangle(double side, double height, String color, boolean filled)
        {
            this.side = side;
            this.height = height;
            this.color = color;
            this.filled = filled;
        }
        public double getSide()
        {

            return side;
        }
        public double getHeight()
        {
            return height;
        }
        public void setSide(double width)
        {
            this.side = width;
        }
        public void setHeight(double height)
        {
            this.height = height;
        }
        @Override
        public double getArea()
        {
            return 0.5*side*height;
        }

        @Override
        public double getPerimeter()
        {
            return Math.sqrt(side*side+4*height*height)+side;
        }

        @Override
        public String toString()
        {
            return "Shape: triangle, side: " + this.side +", height: " + this.height + ", color: " + this.color;
        }
    }*/
}
