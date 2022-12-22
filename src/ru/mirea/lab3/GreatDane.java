package ru.mirea.lab3;

public class GreatDane extends Dog
{
    public GreatDane(String name, String color, double height)
    {
        this.name=name;
        this.color=color;
        this.height=height;
    }

    @Override
    public String toString() {
        return "Порода собаки: немецкий дог \nИмя - "+name+", окрас - "+color+", рост = "+height+" см";
    }

    @Override
    public void characterize() {
        System.out.println("Характер: дружелюбный, преданный, сдержанный, любящий, уверенный в себе, нежный");
    }

    @Override
    public void bark() {
        System.out.println("Вуф");
    }
}
