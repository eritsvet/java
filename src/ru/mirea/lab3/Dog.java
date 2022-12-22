package ru.mirea.lab3;

public abstract class Dog
{
    protected double height;
    protected String name, color;
    public Dog(){

    }
    public Dog(String name, String color,double height)
    {
        this.name=name;
        this.color=color;
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString()
    {
        return "Собака: Имя - "+name+", окрас - "+color+", рост = "+height+" см";
    }

    public abstract void characterize();

    public abstract void bark();
}
